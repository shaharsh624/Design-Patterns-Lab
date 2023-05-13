package NewOS;

public class MobileOSFactory extends OSFactory {
    MobileOSFactory getMobile(String choice) {
        if (choice.equalsIgnoreCase("Android")) {
            return new Android();
        } else if (choice.equalsIgnoreCase("IOS")) {
            return new IOS();
        } else {
            return null;
        }
    }

    DesktopOSFactory getDesktop(String choice) {
        return null;
    }
}
