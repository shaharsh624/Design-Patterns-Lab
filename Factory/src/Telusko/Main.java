package Telusko;

public class Main {
    public static void main(String[] args) {
        OSFactory factory = new OSFactory();
        OS os = factory.getInstance("Windows");
        os.spec();
    }
}
