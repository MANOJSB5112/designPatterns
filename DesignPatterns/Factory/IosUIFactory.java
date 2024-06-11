package DesignPatterns.Factory;

public class IosUIFactory implements UIFactory{
    @Override
    public void createSomething() {
        System.out.println("I am creating something called IOS");
    }

    @Override
    public void printSomething() {
        System.out.println("I am printing something called IOS ");
    }

    @Override
    public void updateSomething() {
        System.out.println("I am updating something called IOS ");
    }
}
