package Singleton;

public class EagerInitilization2 {
    private static class DBC{
        private static DBC instance=new DBC();
        public static DBC getInstance()
        {
                System.out.println("created new object"+" "+ Thread.currentThread().getName());
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


/* Here multiple times the object is created
created new object Thread-0
created new object Thread-6
created new object Thread-9
created new object Thread-5
created new object Thread-1
created new object Thread-3
created new object Thread-2
created new object Thread-8
created new object Thread-4
created new object Thread-7

 */