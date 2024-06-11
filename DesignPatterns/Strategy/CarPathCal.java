package DesignPatterns.Strategy;

public class CarPathCal implements PathCalInterface{
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Path distance and time through Car from "+source +" " +destination+" is  22 km and  1.5hours");
    }
}
