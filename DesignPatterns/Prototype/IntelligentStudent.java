package DesignPatterns.Prototype;

public class IntelligentStudent extends Student{


   public IntelligentStudent()
   {

   }
   public IntelligentStudent(IntelligentStudent intelligentStudent)
   {
       super(intelligentStudent);
   }
    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }

//    public int getIq() {
//        return iq;
//    }
//
//    public void setIq(int iq) {
//        this.iq = iq;
//    }

}
