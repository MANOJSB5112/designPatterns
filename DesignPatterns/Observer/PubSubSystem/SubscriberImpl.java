package DesignPatterns.Observer.PubSubSystem;

public class SubscriberImpl implements Subscriber{

    Broker broker;

    SubscriberImpl(Broker broker)
    {
        this.broker=broker;
    }

    @Override
    public void onMessage(Message message) {
        System.out.println("Received message  "+ message.getContent());
    }

    @Override
    public void subscribe(String name) {

        Topic t=broker.getTopic(name);
        if(t!=null)
        {
            t.addSubscriber(this);
            System.out.println("Subscribed for the topic " +name);
        }else {
            System.out.println("No topic found with the name " +name);
        }
    }
    @Override
    public void unSubscribe(String name) {
        Topic t=broker.getTopic(name);
        if(t!=null)
        {
            t.removeSubscriber(this);
            System.out.println("Subscribed for the topic " +name);
        }else {
            System.out.println("No topic found with the name " +name);
        }
    }
}
