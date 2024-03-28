package LambdasAndStreams;
import java.lang.*;
public class FunctionalInterface {
    public static void main(String[] args) {
        Example ex=new Example()
        {
            @Override
            public void show() {
                System.out.println("Functional Interface are the interface which has only one method in it");
                System.out.println("I am using functional Interface and concept of anonymous class");
            }
        };
        ex.show();
    }
}

@java.lang.FunctionalInterface
interface Example
{
    public void show();
}
