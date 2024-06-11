package DesignPatterns.Prototype;

import javax.rmi.CORBA.StubDelegate;

public class Main {

    public static void fillRegistry(StudentRegistry studentRegistry)
    {
        Student student= new Student();
        student.setBatch("May2023");
        student.setPsp(80);
        student.setIq(100);
        studentRegistry.register("student",student);

        AverageStudent avg=new AverageStudent();
        avg.setIq(70);
        avg.setBatch("May2023");
        avg.setPsp(70);
        studentRegistry.register("avg", avg);

        IntelligentStudent intelstd=new IntelligentStudent();
        intelstd.setIq(90);
        intelstd.setBatch("May2023");
        intelstd.setPsp(95);
        studentRegistry.register("intelstd",intelstd);

        PoorStudent poorstd=new PoorStudent();
        poorstd.setIq(50);
        poorstd.setBatch("May2023");
        poorstd.setPsp(55);
        studentRegistry.register("poorstd",poorstd);
    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry=new StudentRegistry();
        fillRegistry(studentRegistry);

      Student manoj=studentRegistry.getRegistry("avg").clone();
      manoj.setName("Manoj");
      manoj.setAge(23);

      Student chethan=studentRegistry.getRegistry("intelstd").clone();
      chethan.setName("Chethan");
      chethan.setBatch("Nov2023");

        System.out.println(chethan.name);
        System.out.println(chethan.psp);
        System.out.println(chethan.batch);
        System.out.println(manoj.iq);




    }
}
