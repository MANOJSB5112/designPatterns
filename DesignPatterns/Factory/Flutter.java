package DesignPatterns.Factory;
public class Flutter {

   public static UIFactory getUIFactory(SupportedPlatform platform)
   {
       switch (platform) {
           case ANDROID:
               return new AndroidUIFactory();
           case IOS:
               return new IosUIFactory(); // Assuming you will create this class similarly to AndroidUIFactory
           case WINDOWS:
               return new WindowsUIFactory();
           default:
               throw new IllegalArgumentException("Unsupported platform: " + platform);
       }
   }

}
