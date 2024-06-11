package DesignPatterns.Factory;

public class UIFactoryHelper {

    public static UIFactory getFactory(SupportedPlatform platform)
    {
        if(platform.equals("ANDROID")) {
            return new AndroidUIFactory();
        }else if(platform.equals("WINDOWS"))
        {
            return new WindowsUIFactory();
        }else if(platform.equals("IOS"))
        {
            return new IosUIFactory();
        }
         return null;
    }
}
