package DesignPatterns.Strategy.DucksExample;

public class SimpleQuacking implements IQuackBehaviour{
    @Override
    public void quack() {
        System.out.println("I can quack only once - 'Quack'");
    }
}
