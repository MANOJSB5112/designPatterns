package DesignPatterns.Observer.PubSubSystem;

public class PublisherImpl implements  Publisher{

    public Broker broker;

    PublisherImpl(Broker broker)
    {
        this.broker=broker;
    }
    @Override
    public void publish(String name, Message message) {

        Topic t=broker.getTopic(name);
        if(t!=null)
        {
            t.addMessage(message);
        }else {
            System.out.println("No topics found with this name "+ name);
        }

    }
}
