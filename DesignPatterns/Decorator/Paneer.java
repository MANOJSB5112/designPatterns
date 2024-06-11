package DesignPatterns.Decorator;



public class Paneer implements Pizza{
    //Toppings
    Pizza pz;

    public Paneer(Pizza pz)
    {
        this.pz=pz;
    }
    @Override
    public int getCost() {
        return pz.getCost()+60;
    }

    @Override
    public String getDescription() {
      return  pz.getDescription()+"Panner + ";
    }
}
