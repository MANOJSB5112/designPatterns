package DesignPatterns.Builder;

public class Student {
    String name;
    int age;
    int gradYear;
    double psp;

    public Student(Builder help)
    {
        if(help.getAge()<20)
        {
            throw new RuntimeException("Age is less than 20 ");
        }
        if(help.gradYear<2021)
        {
            throw new RuntimeException("Grad year is less than 2021");
        }
        this.name=help.getName();
       // this.name=help.name;
        this.age=help.getAge();
        //this.age=help.age;
        this.gradYear=help.getGradYear();
        //this.gradYear=help.gradYear;
        this.psp=help.getPsp();
        //this.psp=help.psp;
    }
}
