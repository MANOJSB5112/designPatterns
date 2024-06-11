package inheritancePractice;

public class ClassC extends ClassB{
    public ClassC()
    {
        //super("chethan");
       // System.out.println("C");
    }
    void print()
    {
        super.print();
        System.out.println("I am in C");
    }
    void print(String s)
    {
        System.out.println("I am in C"+" "+ s);
    }
}
