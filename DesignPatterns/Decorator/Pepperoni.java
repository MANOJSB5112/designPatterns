package DesignPatterns.Decorator;

public class Pepperoni implements Pizza{
    //Base
    Pizza pz;
    public Pepperoni()
    {

    }
    public Pepperoni(Pizza pz)
    {
        this.pz=pz;
    }
    @Override
    public int getCost() {
        if(pz==null)
        {
            return 180;
        }
        return pz.getCost()+180;

    }

    @Override
    public String getDescription() {
        if(pz==null)
        {
            return "Pepperoni + ";
        }
    return pz.getDescription()+"Pepperoni + ";
    }
}
