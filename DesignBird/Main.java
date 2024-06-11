package DesignBird;

public class Main {
    public static void main(String[] args) {
        int i=0;
          Flying f=new Flying();
          f.makeSound();
          f.fly();

          NonFlyingBird nf=new NonFlying();
          nf.makeSound();
    }
    public static  class Flying implements FlyingBird
    {

        @Override
        public void makeSound() {
            System.out.println("This Bird makes sound");
        }

        @Override
        public void fly() {
            System.out.println("This bird can fly");
        }
    }
    public static class NonFlying implements NonFlyingBird
    {

        @Override
        public void makeSound() {
            System.out.println("This bird only make sound");
        }
    }
}
