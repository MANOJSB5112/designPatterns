package DesignPatterns.ObserverDesignPattern;

public class OnOrderNotifyCustomer implements AmazonOnOrderNotify{

    public void notifyOrder()
    {
       System.out.println("Your Order is sucessfully placed");
    }
    
}
