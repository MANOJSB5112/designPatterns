package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Example2 {
    public static void main(String[] args) {
        System.out.println("I am now trying to read file");
        try
        {
            readFile("Scaler.txt");
        }catch(Exception ex)
        {
            System.out.println("File is not found"+ ex.getMessage());
        }finally {
            System.out.println("Anyways I will print as i am finally");
        }
        System.out.println("I have read the file now");

    }

    public static void readFile(String filename) throws FileNotFoundException
    {

        FileReader fr=new FileReader(filename);
    }
}
