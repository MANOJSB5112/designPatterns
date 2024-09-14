package DesignPatterns.Observer.PubSubSystem;

public interface Subscriber {

    public void onMessage(Message message);
    public void subscribe(String  name);

    public void unSubscribe(String name);
}
