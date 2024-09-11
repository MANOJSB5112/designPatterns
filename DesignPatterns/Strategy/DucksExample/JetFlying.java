package DesignPatterns.Strategy.DucksExample;

public class JetFlying implements IFlyingBehaviour{
    @Override
    public void fly() {
        System.out.print("I can fly like a jet");
    }
}
