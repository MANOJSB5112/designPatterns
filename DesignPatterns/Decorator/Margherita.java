package DesignPatterns.Decorator;

public class Margherita implements Pizza{
    //Base
    Pizza pz;

    public Margherita()
    {

    }
    public Margherita(Pizza pz)
    {
        this.pz=pz;
    }
    @Override
    public int getCost() {
        if(pz==null)
        {
            return 200;
        }
     return pz.getCost()+200;
    }

    @Override
    public String getDescription() {
       if(pz==null)
       {
           return "Margherita + ";
       }
       return pz.getDescription()+"Margherita + ";
    }
}
