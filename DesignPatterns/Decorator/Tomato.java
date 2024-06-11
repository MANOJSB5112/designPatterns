package DesignPatterns.Decorator;

public class Tomato implements Pizza{
    //Toppings
    Pizza pz;
    public Tomato(Pizza pz)
    {
        this.pz=pz;
    }
    @Override
    public int getCost() {
    return pz.getCost()+30;
    }

    @Override
    public String getDescription() {
    return pz.getDescription()+"Tomato + ";
    }
}
