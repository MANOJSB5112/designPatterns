package DesignPatterns.Factory;

public class Main {
    public static void main(String[] args) {
        Flutter flu=new Flutter();
        UIFactory uif=Flutter.getUIFactory(SupportedPlatform.valueOf("WINDOWS"));

       uif.printSomething();
       uif.createSomething();
       uif.updateSomething();
    }
}
