package threadpractice.practice2;

public class Client {
    public static void main(String[] args) {
        System.out.println("Starting Thread...."+" "+ Thread.currentThread().getName());
        HelloWorldPrinter hp=new HelloWorldPrinter();
        Thread t1=new Thread(hp);
        t1.start();
        OneToTenPrinter op=new OneToTenPrinter();
        op.run(); //main thread is executing
       Thread t2=new Thread(op);   //new thread will execute the task separately
        t2.start();
        Thread t3=new Thread(()->System.out.println("Hello Manoj"+Thread.currentThread().getName()));
        t3.start();
        System.out.println("Thread Executed Successfully");


    }
}
//Starting Thread....
//Thread Executed Successfully
//1
//        2
//        3
//        4
//        5
//Hello World
//6
//        7
//        8
//        9
//        10