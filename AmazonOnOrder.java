package DesignPatterns.ObserverDesignPattern;

import java.util.ArrayList;

public class AmazonOnOrder {
public static AmazonOnOrder instance=null;

    public ArrayList<AmazonOnOrderNotify> list=new ArrayList<>();

    public void register(AmazonOnOrderNotify az)
    {
        list.add(az);
    }

    public void deregister(AmazonOnOrderNotify az)
    {
        list.remove(az);
    }
    public static AmazonOnOrder getInstance()
    {
        if(instance==null)
        {
            synchronized(AmazonOnOrder.class)
            {
                if (instance==null)
                {
                    instance= new AmazonOnOrder();
                }
            }
        }
        return instance;
    }

    public void onOrderPlaced()
    {
       
        for(AmazonOnOrderNotify az: list)
        {
            az.notifyOrder();
        }
    }
}
