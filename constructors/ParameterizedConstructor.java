package constructors;

public class ParameterizedConstructor {
    public static class Student {
        String name;
        int rollno;
        public Student(String name,int rollno)
        {
            this.name=name;
            this.rollno=rollno;
        }
        public Student()
        {
            this.name="Empty";
            this.rollno=100;
        }
        public void printStudent()
        {
            System.out.println("The student name and rollno is : "+name+" "+rollno);
        }
    }

    public static void main(String[] args) {
        Student st=new Student("Manoj",1850);
        st.printStudent();
        Student st2=new Student();
        st2.name="Chethan";
        st2.rollno=20;
        st2.printStudent();
    }
}
