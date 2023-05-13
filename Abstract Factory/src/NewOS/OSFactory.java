package NewOS;

public abstract class OSFactory{
    abstract MobileOSFactory getMobile(String choice);
    abstract DesktopOSFactory getDesktop(String choice);
}
