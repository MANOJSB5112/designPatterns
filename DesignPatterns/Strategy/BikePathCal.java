package DesignPatterns.Strategy;

public class BikePathCal implements PathCalInterface{
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Path distance and time through Bike from "+source +" " +destination+" is  21 km and 2 hours");
    }
}
