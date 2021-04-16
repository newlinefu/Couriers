package repository;

import entities.Message;
import entities.Path;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MessageRepository implements IMessageRepository {

    private List<Message> messages = new ArrayList<Message>() {

    };

    @Override
    public void addMessage(Message message) {
        messages.add(message);
    }

    @Override
    public Message deleteMessage(UUID messageId) {
        Message deletedMessage = getMessage(messageId);
        messages.removeIf(r -> r.getMessageId().equals(messageId));

        return deletedMessage;
    }

    @Override
    public Message getMessage(UUID messageId) {
        Optional<Message> result = messages.stream().filter(m -> m.getMessageId().equals(messageId)).findFirst();
        return result.isEmpty() ? null : result.get();
    }

    @Override
    public Collection<Message> getAll() {
        return messages;
    }
}
