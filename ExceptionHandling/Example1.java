package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Example1 {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("I am trying to read file");
        readFile("Scaler.txt");
        System.out.println("I have read the file");

    }

    public static void readFile(String filename) throws FileNotFoundException
    {
        FileReader fr=new FileReader(filename);
    }

}
