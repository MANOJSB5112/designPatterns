package ComparableAndComparator;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ComparableClass {

    public static class Student implements Comparable<Student>
    {
         int age;
         String name;
         Student (int age,String name)
         {
             this.age=age;
             this.name=name;
         }
        @Override
        public int compareTo(Student o) {
            return o.age-this.age;
        }
        @Override
        public String toString() {
            return "Student{name='" + name + "', age=" + age + "}";
        }
    }

    public static void main(String[] args) {
        List<Student> st=new ArrayList<>();
        st.add(new Student(20,"Bajaj"));
        st.add(new Student(21,"Chethan"));
        st.add(new Student(22,"Sound"));
        st.add(new Student(23,"Radha"));
        st.add(new Student(24,"Balaji"));

        List<Integer> ans=st.stream()
                .filter(student->student.name.startsWith("C"))
                .map(student-> student.name.length()).collect(Collectors.toList());
        System.out.println(ans);
    }
}
