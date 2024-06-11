package DesignPatterns.Builder;

public class Main {
    public static void main(String[] args) {
        Builder help=new Builder();
        help.setName("Manoj");
        help.setAge(23);
        help.setGradYear(2025);
        help.setPsp(90.00);

        Student student=new Student(help);
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gradYear);
    }
}
