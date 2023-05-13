package Geekific;

public class OffState extends State {
    public OffState(Phone phone) {
        super(phone);
    }

    public String OnHome() {
        phone.setState(new LockedState(phone));
        return phone.turnOn();
    }
    public String OnOffOn() {
        phone.setState(new LockedState(phone));
        return phone.turnOn();
    }
}
