package NewOS;

public class Producer {
    public static OSFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Mobile")) {
            return new MobileOSFactory();
        } else if (choice.equalsIgnoreCase("Desktop")) {
            return new DesktopOSFactory();
        } else {
            return null;
        }
    }
}
