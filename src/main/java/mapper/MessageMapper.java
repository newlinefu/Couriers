package mapper;

import dto.MessageDto;
import entities.Message;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface MessageMapper {
    Message dtoToMessage(MessageDto messageDto);

    MessageDto messageToDto(Message message);

    List<Message> listDtoToListMessage(List<MessageDto> messageDtoList);

    List<MessageDto> listMessageToListDto(List<Message> messageList);
}
