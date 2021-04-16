package entities;

import java.util.UUID;

public class Message {
    private UUID messageId;
    private String content;

    public Message(String content) {
        this.content = content;
        this.messageId = UUID.randomUUID();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public UUID getMessageId() {
        return messageId;
    }
}
