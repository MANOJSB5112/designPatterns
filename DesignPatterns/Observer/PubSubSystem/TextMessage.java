package DesignPatterns.Observer.PubSubSystem;

public class TextMessage implements Message{

    String content;

    public TextMessage(String content)
    {
        this.content=content;
    }

    @Override
    public String getContent() {
        return content;
    }
}
