package DesignPatterns.Observer;

public class LogisticService implements OrderPlacedInterface{
    //Subscriber
    public LogisticService()
    {
        Myntra myntra=Myntra.getInstance();
        myntra.registerSubscriber(this);
    }
    @Override
    public void onOrderPlaced() {
        System.out.println("order successfully placed updating logistics");
    }
}
