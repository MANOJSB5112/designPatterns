package ExceptionHandling;

import java.io.FileReader;

public class Example3 {
    public static void main(String[] args) {
        System.out.println("I am now trying to read file");

        readFile("Scaler.txt");

        System.out.println("I have read the file now");

    }

    public static void readFile(String filename)
    {
        try{
            FileReader fr=new FileReader(filename);
        }catch(Exception ex)
        {
            System.out.println("File is not found"+ ex.getMessage());
        }finally {
            System.out.println("Anyways I will print as i am finally");
        }
    }
}
