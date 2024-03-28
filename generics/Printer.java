package generics;

public class Printer<t>{
    t num;


    public Printer(t num)
    {
        this.num=num;
    }
    public t get()
    {
        return num;
    }
}
