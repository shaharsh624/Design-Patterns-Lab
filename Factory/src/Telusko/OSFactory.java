package Telusko;

public class OSFactory {
    public OS getInstance(String str) {
        if(str.equalsIgnoreCase("Android")) {
            return new Android();
        }
        else if(str.equalsIgnoreCase("IOS")) {
            return new IOS();
        }
        else if(str.equalsIgnoreCase("Windows")) {
            return new Windows();
        }
        else {
            return null;
        }
    }
}
