package DesignPatterns.Strategy;

import java.sql.SQLOutput;

public class WalkPathCal implements PathCalInterface{

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Path distance and time through walking from "+source +" " +destination+" is  25 km and 5 hours");
    }
}
