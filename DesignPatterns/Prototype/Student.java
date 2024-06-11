package DesignPatterns.Prototype;

public class Student implements PrototypeInterface{
    String name;
    int age;
    int gradYear;
    double psp;
    String batch;
    int iq;

    public Student()
    {

    }
    public  Student(Student student)
    {
        this.name=student.name;
        this.age=student.age;
        this.gradYear=student.gradYear;
        this.psp=student.psp;
        this.iq=student.iq;
        this.batch=student.batch;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
