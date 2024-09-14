package DesignPatterns.Observer.PubSubSystem;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Topic {

    String name;
    public Queue<Message> messageQueue;
    public Set<Subscriber> subscribers;

    public Topic(String name)
    {
        this.name=name;
        this.messageQueue=new LinkedList<>();
        subscribers=new HashSet<>();
    }
    public void addMessage(Message message)
    {
        messageQueue.add(message);
        publishMessage();
    }
    public void addSubscriber(Subscriber sub)
    {
        subscribers.add(sub);
    }
    public void removeSubscriber(Subscriber sub)
    {
        subscribers.remove(sub);
    }
    public void publishMessage()
    {
        for(Subscriber subscriber:subscribers)
        {
            for(Message message:messageQueue)
            {
                subscriber.onMessage(message);
            }
        }
        messageQueue.clear();
    }

}
