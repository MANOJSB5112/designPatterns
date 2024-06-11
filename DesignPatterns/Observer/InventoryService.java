package DesignPatterns.Observer;

public class InventoryService implements OrderPlacedInterface{
    //Subscribers

    static InventoryService is;

    public InventoryService()
    {
        Myntra myntra=Myntra.getInstance();
        myntra.registerSubscriber(this);
    }
    @Override
    public void onOrderPlaced() {
        System.out.println("order successfully placed updating inventory");
    }
}
