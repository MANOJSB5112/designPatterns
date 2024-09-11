package inheritancePractice.Pactise2;

public class Maruthi extends Car{
    int manufactureYear;
    Maruthi(int myear,int model,String name)
    {
        super(name,model);
        this.manufactureYear=myear;
    }
}
