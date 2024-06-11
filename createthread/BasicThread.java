package createthread;

public class BasicThread implements Runnable{
    public void run()
    {
        System.out.println("I am in basic thread class"+ Thread.currentThread().getName());
    }

}
