package DesignPatterns.Observer.PubSubSystem;

import java.util.HashMap;
import java.util.Map;

public class Broker {

   public Map<String,Topic> topics=new HashMap<>();


   public void addTopic(String name)
   {
       topics.putIfAbsent(name,new Topic(name));
   }
   public Topic getTopic(String name)
   {
       if(topics.containsKey(name))
       {
           return topics.get(name);
       }
       return null;
   }
}
