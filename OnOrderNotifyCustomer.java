package DesignPatterns.ObserverDesignPattern;

public class OnOrderNotifyCustomer implements AmazonOnOrderNotify{
    static OnOrderNotifyCustomer onc;

    public OnOrderNotifyCustomer()
    {
        AmazonOnOrder az= AmazonOnOrder getInstance();
        az.register(this);
    }

    public void notifyOrder()
    {
       System.out.println("Your Order is sucessfully placed");
    }
    
}
