package Singleton;

public class MultipleObjCreation3 {
    private static class DBC{
        private static DBC instance=null;
        public static DBC getInstance()
        {
            if(instance==null) {
                synchronized (DBC.class)
                {
                    instance = new DBC();
                    System.out.println("created new object"+" "+ Thread.currentThread().getName());
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

/* Even here sometimes multiple obj might be created
created new object Thread-7
sometimes thread number might change
*/