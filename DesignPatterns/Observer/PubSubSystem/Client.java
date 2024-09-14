package DesignPatterns.Observer.PubSubSystem;

public class Client {
    public static void main(String[] args) {
        Broker broker=new Broker();
        Publisher publisher=new PublisherImpl(broker);
        Subscriber subscriber=new SubscriberImpl(broker);

        Topic topic=new Topic("payment");
        broker.addTopic("payment");
        subscriber.subscribe("payment");
        Message message1=new TextMessage("Your payment was done for order #12321");
        publisher.publish("payment",message1);


        Topic shippingTopic=new Topic("shippingTopic");
        broker.addTopic("shippingTopic");
        subscriber.subscribe("shippingTopic");
        Message message=new TextMessage("Your order #12321, shipping is updated");
        publisher.publish("shippingTopic",message);



    }
}
