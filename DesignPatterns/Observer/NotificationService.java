package DesignPatterns.Observer;

public class NotificationService implements OrderPlacedInterface{
    //Subscriber
    public NotificationService()
    {
        Myntra myntra=Myntra.getInstance();
        myntra.registerSubscriber(this);
    }
    @Override
    public void onOrderPlaced() {
        System.out.println("Order Successfully Placed notifying the User");
    }
}
