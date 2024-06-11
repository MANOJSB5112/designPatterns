package DesignPatterns.ObserverDesignPattern;

public class OnOrderNotifyLogistics implements AmazonOnOrderNotify{
    
    public void notifyOrder()
    {
        System.out.println("Please ship this order");
    }
}
