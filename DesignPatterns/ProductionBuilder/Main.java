package DesignPatterns.ProductionBuilder;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Student st=Student.getBuilder()
                    .setName("Manoj")
                .setAge(23)
                .setPsp(85.0)
                .setUniversity("Jain")
                .build();

        System.out.println(st.name);
        System.out.println(st.age);
        System.out.println(st.university);
    }
}
