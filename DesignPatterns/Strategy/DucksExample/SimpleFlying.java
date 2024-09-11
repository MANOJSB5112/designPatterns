package DesignPatterns.Strategy.DucksExample;

public class SimpleFlying implements IFlyingBehaviour{
    @Override
    public void fly() {
        System.out.println("I can just fly");
    }
}
