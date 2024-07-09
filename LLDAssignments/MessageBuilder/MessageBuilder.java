package LLDAssignments.MessageBuilder;

@WithBuilder
public class MessageBuilder {
    private MessageType messageType;
    private String content;
    private String sender;
    private String recipient;
    private boolean isDelivered;
    private long timestamp;

    public MessageBuilder(MessageType messageType, String content, String sender, String recipient, boolean isDelivered, long timestamp) {
        this.messageType = messageType;
        this.content = content;
        this.sender = sender;
        this.recipient = recipient;
        this.isDelivered = isDelivered;
        this.timestamp = timestamp;
    }

    public static Builder getBuilder ()
    {
        return new Builder();
    }

    public static class Builder {
        private MessageType messageType;
        private String content;
        private String sender;
        private String recipient;
        private boolean isDelivered;
        private long timestamp;

        public MessageType getMessageType() {
            return messageType;
        }

        public Builder setMessageType(MessageType type) {
            this.messageType = type;
            return this;
        }

        public String getContent() {
            return content;
        }

        public Builder setContent(String cont) {
            this.content = cont;
            return this;
        }

        public Builder setRecipient(String recipient) {
            this.recipient = recipient;
            return this;
        }

        public String getRecipient() {
            return recipient;
        }

        public Builder setSender(String sender) {
            this.sender = sender;
            return this;
        }

        public String getSender() {
            return sender;
        }

        public Builder setDelivered(boolean bool) {
            this.isDelivered = bool;
            return this;
        }

        public boolean getisDelivered() {
            return isDelivered;
        }

        public Builder setTimestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public long getTimestamp() {
            return timestamp;
        }

        public MessageBuilder build() {
            return new MessageBuilder(this.messageType, this.content, this.sender, this.recipient, this.isDelivered, this.timestamp);
        }
    }
}
// if some is calling ;
//        MessageBuilder messageBuilder=MessageBuilder.getBuilder()
//                .setMessageType(MessageType.TEXT)
//                .setContent("ABC")
//                .setSender("manoj")
//                .setDelivered(true)
//                .setRecipient("chethan")
//                .setTimestamp(0)
//                .build();
//
//    }