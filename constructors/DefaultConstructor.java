package constructors;


public class DefaultConstructor {
    public static class Car{
        public  int model;
        public  String name;
        public void brandName(){
            System.out.println(this.name+" "+this.model);
        }
    }
    public static void main(String[] args) {
        Car cr=new Car();
        cr.name="Maruthi";
        cr.model=2000;
        cr.brandName();
    }
}
