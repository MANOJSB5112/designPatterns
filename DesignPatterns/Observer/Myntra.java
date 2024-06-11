package DesignPatterns.Observer;

import com.sun.corba.se.impl.orbutil.concurrent.Sync;
import com.sun.org.apache.xerces.internal.parsers.CachingParserPool;

import java.util.ArrayList;
import java.util.List;

public class Myntra {
    //Publisher
    public static Myntra instance=null;
  static  List<OrderPlacedInterface> subscriberList=new ArrayList<>();

   public void registerSubscriber(OrderPlacedInterface opi)
   {
      subscriberList.add(opi);
   }
   public void deregisterSubscriber(OrderPlacedInterface opi)
   {
       subscriberList.remove(opi);
   }
    public static Myntra getInstance()
    {
        if(instance==null)
        {
            synchronized(Myntra.class)
            {
                if (instance==null)
                {
                    instance= new Myntra();
                }
            }
        }
        return instance;
    }
    public void orderPlaced()
    {
        InventoryService is=new InventoryService();
        LogisticService ls=new LogisticService();
        NotificationService ns=new NotificationService();
        for(OrderPlacedInterface opi:subscriberList)
        {
            opi.onOrderPlaced();
        }
    }
}
