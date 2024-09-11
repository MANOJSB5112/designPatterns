package DesignPatterns.Strategy.DucksExample;

public class CityDucks extends Ducks{

    IQuackBehaviour qb;
    IFlyingBehaviour fb;

    CityDucks()
    {
        this.fb=new JetFlying();
        this.qb=new UniqueQuacking();
    }
   @Override
    void quack() {
        qb.quack();

   }

    @Override
    void fly() {
        fb.fly();

    }
}
