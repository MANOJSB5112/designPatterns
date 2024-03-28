package LambdasAndStreams;

import inheritance.A;

public class FunctionalInterfaceAndLambda {
    public static void main(String[] args) {
        Runnable r=()->{
            System.out.println("Functional Interface are the interface which has only one method in it");
            System.out.println("we can creat anonymous class of functional interface in short by using Lambdas.Here we are creating new thread ");
        };
        Thread t=new Thread(r);
        t.start();
        System.out.println();
        Example2 ex=new Example2(){
            @Override
            public void print() {
                System.out.println("This is normal anonymous class creation of interface ");
            }
        };
        ex.print();
        System.out.println();
        Example2 ex2=()->{
            System.out.println("This is the long form of lambda for functional interface");
        };
        ex2.print();
        System.out.println();
        Example2 ex3=()->System.out.println("This is the short form of lambda for functional interface.When you have only one line use this");
         ex3.print();
         System.out.println();

         Square squ=n->{
             int sq=n*n;
             System.out.println("This is how you right lambda function for functional interface when it has integer parameter");
             System.out.println(sq);
         };
         squ.square(5);
        System.out.println();

        StringPrinter st=str->
        {
            String exa=str;
            System.out.println("This is how you right lambda function for functional interface when it has string parameter");
            System.out.println(exa);
        };
        st.print("Manoj");
        System.out.println();

        Addition addnum=(a,b)->a+b;
            System.out.println("a+b:"+ addnum.add(20,30));
        //addnum.add(10,20);
        System.out.println();

        Runnable rlambda=()->System.out.println("This creating and running thread in short using lambda");
         Thread th=new Thread(rlambda);
         th.start();
    }
}
@java.lang.FunctionalInterface interface Example2
{
    void print();
}
@java.lang.FunctionalInterface interface Square
{
    public void square(int n);
}

@java.lang.FunctionalInterface interface StringPrinter
{
    public void print(String str);
}
interface Addition
{
    public int add(int a,int b);
}