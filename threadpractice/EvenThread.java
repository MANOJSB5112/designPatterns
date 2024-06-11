package threadpractice;

public class EvenThread implements  Runnable{
    public void run()
    {
        for(int i=0;i<50;i++)
        {
            if(i%2==0)
            {
                System.out.println("This thread is even " + i);
            }
        }
    }
}
