package DesignPatterns.Decorator;

public class Farmhouse implements Pizza{
  //base
    Pizza pz;

    public Farmhouse()
    {

    }
    public Farmhouse(Pizza pz)
    {
      this.pz=pz;
    }
    @Override
    public int getCost() {
      if(pz==null)
      {
        return 150;
      }
      return pz.getCost()+150;
    }

    @Override
    public String getDescription() {
      if(pz==null)
      {
        return "Farmhouse + ";
      }
      return pz.getDescription()+"Farmhouse + ";
    }
}
