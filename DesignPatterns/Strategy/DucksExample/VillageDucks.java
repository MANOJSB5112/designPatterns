package DesignPatterns.Strategy.DucksExample;

public class VillageDucks extends Ducks{
      IFlyingBehaviour fb;
      IQuackBehaviour qb;

      VillageDucks()
      {
          this.fb=new SimpleFlying();
          this.qb=new SimpleQuacking();
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
