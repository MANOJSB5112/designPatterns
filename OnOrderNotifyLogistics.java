package DesignPatterns.ObserverDesignPattern;

public class OnOrderNotifyLogistics implements AmazonOnOrderNotify{

 static OnOrderNotifyLogistics onl;
    public OnOrderNotifyLogistics()
    {
        AmazonOnOrder az=AmazonOnOrder getInstance();
        az.register(this);
    }
    
    public void notifyOrder()
    {
        System.out.println("Please ship this order");
    }
}
