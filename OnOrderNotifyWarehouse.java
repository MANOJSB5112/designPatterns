package DesignPatterns.ObserverDesignPattern;

public class OnOrderNotifyWarehouse implements AmazonOnOrderNotify{

    public OnOrderNotifyWarehouse onw;

    public OnOrderNotifyWarehouse ()
    {
        AmazonOnOrder az=AmazonOnOrder.getInstance()
        AmazonOnOrder.register(az);

    }
    public void notifyOrder()
    {
        System.out.println("Order recevied for the product Nike Rev 6");
    }
    
}
