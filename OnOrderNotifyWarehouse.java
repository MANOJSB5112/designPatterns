package DesignPatterns.ObserverDesignPattern;

public class OnOrderNotifyWarehouse implements AmazonOnOrderNotify{
    public void notifyOrder()
    {
        System.out.println("Order recevied for the product Nike Rev 6");
    }
    
}
