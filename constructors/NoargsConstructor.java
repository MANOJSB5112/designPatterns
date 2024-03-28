package constructors;


public class NoargsConstructor {
    public static class Car{
      public  int model;
      public  String name;
      public Car()
      {
          this.name="Ferarri";
          this.model=2000;
      }
        public void brandName(){
            System.out.println(this.name+" "+this.model);
        }
    }
    public static void main(String[] args) {
        Car cr=new Car();
        cr.brandName();
    }
}
