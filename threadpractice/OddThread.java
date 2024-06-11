package threadpractice;

public class OddThread implements Runnable{

    public void run()
    {
        for(int i=0;i<50;i++)
        {
            if(i%2==1)
            {
                System.out.println("This thread is odd "+ i);
            }
        }
    }

}
