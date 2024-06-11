package DesignPatterns.Factory;

public class AndroidUIFactory implements UIFactory{

    @Override
    public void createSomething() {
        System.out.println("I am creating something called Android ");
    }

    @Override
    public void printSomething() {
        System.out.println("I am printing something called Android ");
    }

    @Override
    public void updateSomething() {
        System.out.println("I am updating something called Android ");
    }
}
