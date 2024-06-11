package DesignPatterns.ObserverDesignPattern;

public class Client{
    public static void main(String[] args) {
        AmazonOnOrder az=AmazonOnOrder.getInstance();
        az.onOrderPlaced();
    }
}