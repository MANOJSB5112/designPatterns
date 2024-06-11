package DesignPatterns.ObserverDesignPattern;

import java.util.ArrayList;

public class AmazonOnOrder {
public static AmazonOnOrder instance=null;

    public static ArrayList<AmazonOnOrderNotify> list=new ArrayList<>();

    public static void register(AmazonOnOrderNotify az)
    {
        list.add(az);
    }

    public static void deregister(AmazonOnOrderNotify az)
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
        OnOrderNotifyCustomer onc=new OnOrderNotifyCustomer();
        OnOrderNotifyLogistics onl=new OnOrderNotifyLogistics();
        OnOrderNotifyWarehouse onw=new OnOrderNotifyWarehouse();
        for(AmazonOnOrderNotify az: list)
        {
            az.notifyOrder();
        }
    }
}
