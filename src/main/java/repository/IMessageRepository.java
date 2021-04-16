package repository;

import entities.Message;

import java.util.Collection;
import java.util.UUID;

public interface IMessageRepository {

    void addMessage(Message message);

    Message deleteMessage(UUID messageId);

    Message getMessage(UUID messageId);

    Collection<Message> getAll();

}
