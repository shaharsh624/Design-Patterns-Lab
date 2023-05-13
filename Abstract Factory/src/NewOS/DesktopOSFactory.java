package NewOS;

public class DesktopOSFactory extends OSFactory {
    MobileOSFactory getMobile(String choice) {
        return null;
    }

    DesktopOSFactory getDesktop(String choice) {
        if (choice.equalsIgnoreCase("Windows")) {
            return new Windows();
        } else if (choice.equalsIgnoreCase("Mac OS")) {
            return new MacOS();
        } else {
            return null;
        }
    }
}
