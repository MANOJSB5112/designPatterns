package Singleton;

public class DoubleCheckLock4 {
    private static class DBC{
        private static DBC instance=null;
        public static DBC getInstance()
        {
            if(instance==null) {
                synchronized (DBC.class)
                {
                    if(instance==null)
                    {
                        instance = new DBC();
                        System.out.println("created new object"+ " "+Thread.currentThread().getName());
                    }

                }
            }
            return instance;
        }
    }
    public static void main(String[] args) {
        Runnable run=new Runnable() {
            @Override
            public void run() {
                DBC in= DBC.getInstance();
            }
        };

        for(int i=0;i<10;i++)
        {

            Thread th=new Thread(run);
            th.start();
        }
    }

}
/* Here only once thread is created.
created new object Thread-0
 */