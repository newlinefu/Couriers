package service;

import dto.MessageDto;

import java.util.List;

public interface IMessageService {
    List<MessageDto> getAllMessage();

    void deleteAllMessage();

    MessageDto getMessageById(Long messageId);

    MessageDto addMessage(MessageDto messageDto);

    void deleteMessageById(Long messageId);
}
