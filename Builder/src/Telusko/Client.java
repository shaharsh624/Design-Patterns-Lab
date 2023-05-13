package Telusko;

public class Client {
    public static void main(String[] args) {
        PhoneBuilder builder1 = new PhoneBuilder()
                .setOs("Oxygen OS")
                .setBattery("4500 mAh")
                .setProcessor("Snapdragon 8 Gen 2");
        Phone p1 = builder1.getPhone();
        System.out.println(p1);

        PhoneBuilder builder2 = new PhoneBuilder()
                .setOs("One UI")
                .setBattery("4000 mAh")
                .setProcessor("Snapdragon 7 Gen 1");
        Phone p2 = builder2.getPhone();
        System.out.println(p2);
    }
}
