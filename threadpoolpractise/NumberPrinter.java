package threadpoolpractise;

public class NumberPrinter implements Runnable{
    public void run()
    {
        System.out.println("This is a new thread");
        for(int i=0;i<10;i++)
        {
            System.out.println("i: "+i +"thread no: "+ Thread.currentThread().getName());
        }
    }
}
