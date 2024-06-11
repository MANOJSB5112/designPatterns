package createthread;

public class main{
    public static void main(String[] args) {
        BasicThread bt=new BasicThread();
        System.out.println("Main Thread: " + Thread.currentThread().getName());
        Thread t=new Thread(bt);
        t.start();
    }
}
