package DesignPatterns.Strategy.DucksExample;

public class ClientClass {
    public static void main(String[] args) {
        Ducks duck=new CityDucks();
        duck.quack();
        duck.fly();
    }
}
