package DesignPatterns.Decorator;


public class Olive implements Pizza{
    //Toppings
    Pizza pz;

    public Olive(Pizza pz)
    {
        this.pz=pz;
    }
    @Override
    public int getCost() {
    return pz.getCost()+20;
    }

    @Override
    public String getDescription() {
   return pz.getDescription()+"Olive + ";
    }
}
