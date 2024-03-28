package Singleton;

public class MultipleObjCreation1 {
    private static class DBC{
        private static DBC instance=null;
        public static DBC getInstance()
        {
            if(instance==null) {
                instance = new DBC();
                System.out.println("created new object"+" "+ Thread.currentThread().getName());
            }
            return instance;
        }
    }
    public static void main(String[] args) {
        Runnable run=new Runnable() {
            @Override
            public void run() {

               DBC in=DBC.getInstance();
            }
        };

        for(int i=0;i<10;i++)
        {

            Thread th=new Thread(run);
            th.start();
        }
    }

}
/* Sometimes 2 object is created and sometimes only one object is created.Singleton pattern only one obj
should be created.
created new object Thread-0
created new object Thread-8
sometimes thread number might change
 */
