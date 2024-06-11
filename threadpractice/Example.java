package threadpractice;

public class Example {

    public static void main(String[] args) {
        OddThread opt=new OddThread();
        EvenThread ept=new EvenThread();
        Thread t1=new Thread(opt);
        Thread t2=new Thread(ept);
        t1.start();
        t2.start();
    }
}
