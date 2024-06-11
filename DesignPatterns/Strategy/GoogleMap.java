package DesignPatterns.Strategy;

public class GoogleMap {

     public void findPath(String source,String destination,String mode)
     {
         PathCalInterface pci=PathObjFactory.getObj(mode);
         pci.findPath("GmCOTTAGE","Malleshwaram");
     }

}
