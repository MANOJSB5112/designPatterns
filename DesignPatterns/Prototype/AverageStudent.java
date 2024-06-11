package DesignPatterns.Prototype;

public class AverageStudent extends Student{


    public AverageStudent()
    {

    }
    public AverageStudent(AverageStudent averageStudent) {
        super(averageStudent);
    }

    // Implementing the clone method
    @Override
    public AverageStudent clone() {
        return new AverageStudent(this);
    }

//    public int getIq() {
//        return iq;
//    }
//
//    public void setIq(int iq) {
//        this.iq = iq;
//    }
}
