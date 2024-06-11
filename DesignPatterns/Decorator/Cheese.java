package DesignPatterns.Decorator;

public class Cheese implements Pizza{
    //Toppings
    Pizza pz;

    public Cheese(Pizza pz)
    {
        this.pz=pz;
    }
    @Override
    public int getCost() {
        return pz.getCost()+80;
    }

    @Override
    public String getDescription() {
       return pz.getDescription()+"Cheese + ";
    }
}
