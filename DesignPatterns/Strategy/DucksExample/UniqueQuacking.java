package DesignPatterns.Strategy.DucksExample;

public class UniqueQuacking implements IQuackBehaviour{
    @Override
    public void quack() {
        System.out.println("I can quack uniquely -'Quaaaack' ");
    }
}
