package threadpractice.practice2;

import java.sql.SQLOutput;

public class HelloWorldPrinter implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello World"+ Thread.currentThread().getName());
    }
}
