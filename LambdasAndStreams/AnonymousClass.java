package LambdasAndStreams;
import inheritance.*;
//import inheritance.C;

public class AnonymousClass {
    public static void main(String[] args) {
        C c = new C() {
            public void display() {
                System.out.println("Manoj is anonymous");
            }
        };
        c.display();
        Runnable r=new Runnable() {
            @Override
            public void run() {
                System.out.println("I am a new thread"+" "+ Thread.currentThread().getName());
            }
        };
        Thread t=new Thread(r);
        t.start();
    }
}
