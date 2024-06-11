package DesignPatterns.Strategy;

public class PathObjFactory {

    public static PathCalInterface getObj (String mode)
    {
        if(mode.equals("WALK"))
        {
            return new WalkPathCal();
        }else if(mode.equals("CAR"))
        {
            return new CarPathCal();
        }else if(mode.equals("BIKE"))
        {
            return new BikePathCal();
        }else{
            throw new RuntimeException("There is no mode of transportation with "+mode);
        }
    }
}
