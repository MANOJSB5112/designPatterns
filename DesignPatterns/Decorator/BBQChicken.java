package DesignPatterns.Decorator;

public class BBQChicken implements Pizza{
    //Base
    Pizza pz;
    public BBQChicken()
    {

    }

    public BBQChicken(Pizza pz)
    {
        this.pz=pz;
    }
    //Base
    @Override
    public int getCost() {
       if(pz==null)
       {
           return 200;
       }
       return pz.getCost() +200;
    }

    @Override
    public String getDescription() {
        if(pz==null)
        {
            return "BBQChicken + ";
        }
        return pz.getDescription()+"BBQChicken + ";
    }
}
