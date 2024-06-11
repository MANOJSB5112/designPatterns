package inheritancePractice;

public class ClassA {
    private String name;
    public ClassA(String name) {
        this.name=name;
        //System.out.println("A"+" " + name);
    }
    public ClassA(){
      this.name="Manoj";
    }
     void print()
    {
        System.out.println("I am in A and my name is "+ name);
    }
}

