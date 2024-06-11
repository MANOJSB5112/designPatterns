package DesignPatterns.ObserverDesignPattern;

public class Client{
    public static void main(String[] args) {
        OnOrderNotifyCustomer onc=new OnOrderNotifyCustomer();
        OnOrderNotifyLogistics onl=new OnOrderNotifyLogistics();
        OnOrderNotifyWarehouse onw=new OnOrderNotifyWarehouse();
        AmazonOnOrder.getInstance().onOrderPlaced();
    }
}