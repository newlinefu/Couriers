package service.implementation;

import dto.MessageDto;
import entities.Message;
import mapper.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IMessageRepository;
import service.IMessageService;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService implements IMessageService {

    @Autowired
    IMessageRepository messageRepository;
    @Autowired
    MessageMapper messageMapper;

    @Override
    public List<MessageDto> getAllMessage() {
        List<Message> messages = messageRepository.findAll();
        return messageMapper.listMessageToListDto(messages);
    }

    @Override
    public void deleteAllMessage() {
        messageRepository.deleteAll();
    }

    @Override
    public MessageDto getMessageById(Long messageId) {
        Optional<Message> message = messageRepository.findById(messageId);
        return message.map(messageMapper::messageToDto).orElse(null);
    }

    @Override
    public MessageDto addMessage(MessageDto messageDto) {
        Message message = messageMapper.dtoToMessage(messageDto);
        message = messageRepository.save(message);
        return messageMapper.messageToDto(message);
    }

    @Override
    public void deleteMessageById(Long messageId) {
        messageRepository.deleteById(messageId);
    }
}
