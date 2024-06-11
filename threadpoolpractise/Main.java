package threadpoolpractise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        NumberPrinter np=new NumberPrinter();
        ExecutorService es= Executors.newCachedThreadPool();
        for(int i=0;i<5;i++) {
            es.execute(np);
        }
        es.shutdown();
    }
}
