package DesignPatterns.ProductionBuilder;

public class Student {
    String name;
    int age;
    double psp;
    String university;

    private Student(Builder build)
    {
        this.name=build.getName();
        this.age=build.getAge();
        this.psp=build.getPsp();
        this.university=build.getUniversity();
    }
    public static Builder getBuilder()
    {
        return new Builder();    //returns object of builder
    }
    public static class Builder   //inner class
    {
        String name;
        int age;
        double psp;
        String university;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getUniversity() {
            return university;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Student build()
        {
            //Validation
            if(this.age<20)
            {
                throw new RuntimeException("Age is less than 20");
            }
            if(this.psp<80)
            {
                throw new RuntimeException("psp is less than 80");
            }
            return new Student(this);    //new student object is created and cals student private constructor
        }
    }
}

