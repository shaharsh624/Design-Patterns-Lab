package Telusko;

public class PhoneBuilder {
    private String os;
    private String battery;
    private String processor;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }
    public PhoneBuilder setBattery(String battery) {
        this.battery = battery;
        return this;
    }
    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }
    public Phone getPhone() {
        return new Phone(os, battery, processor);
    }
}
