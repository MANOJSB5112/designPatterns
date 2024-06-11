package DesignPatterns.Factory;

public class WindowsUIFactory implements UIFactory{
    @Override
    public void createSomething() {
        System.out.println("I am creating something called Windows ");
    }

    @Override
    public void printSomething() {
        System.out.println("I am printing something called Windows ");
    }

    @Override
    public void updateSomething() {
        System.out.println("I am updating something called Windows ");
    }
}
