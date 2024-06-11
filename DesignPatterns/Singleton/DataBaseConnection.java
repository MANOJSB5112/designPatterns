package DesignPatterns.Singleton;

import javax.xml.crypto.Data;

public class DataBaseConnection {
    private static DataBaseConnection instance=null;
    String username;
    String password;
    String url;

    private DataBaseConnection(){

    }
    public static DataBaseConnection getInstance()
    {
        if(instance==null)
        {
            synchronized(DataBaseConnection.class)
            {
                if(instance==null)
                {
                    instance=new DataBaseConnection();
                    System.out.println("Created new Object");
                }
            }
        }
        return instance;
    }
}
