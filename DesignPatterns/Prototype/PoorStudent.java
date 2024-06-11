package DesignPatterns.Prototype;

public class PoorStudent extends Student{
    public PoorStudent()
    {

    }
    public PoorStudent(PoorStudent poorstudent)
    {
        super(poorstudent);
    }
    @Override
    public PoorStudent clone() {
        return new PoorStudent(this);
    }

//    public int getIq() {
//        return iq;
//    }
//
//    public void setIq(int iq) {
//        this.iq = iq;
//    }
}
