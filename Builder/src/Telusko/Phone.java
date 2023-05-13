package Telusko;

public class Phone {
    private String os;
    private String battery;
    private String processor;

    public Phone(String os, String battery, String processor) {
        this.os = os;
        this.battery = battery;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "\nPhone {" +
                "\n\tOS: '" + os + '\'' +
                ",\n\tBattery: '" + battery + '\'' +
                ",\n\tProcessor: '" + processor + '\'' +
                "\n}";
    }
}
