package inheritancePractice;

public class ClassB extends ClassA{
    
   protected ClassB() {
       super("chethan");
       System.out.println("B");
    }
    void print()
    {
        System.out.println("I am in B");
    }
}
