package generics;

import java.util.Enumeration;

public class Main {
    public static void main(String[] args) {
        Printer<String> ip=new Printer<>("hello");
        String s = ip.get();
        System.out.println(s);


    }
}
