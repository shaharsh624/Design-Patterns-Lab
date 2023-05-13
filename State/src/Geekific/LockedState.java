package Geekific;

public class LockedState extends State {

    public LockedState(Phone phone) {
        super(phone);
    }

    public String OnHome() {
        phone.setState(new ReadyState(phone));
        return phone.unLock();
    }
    public String OnOffOn() {
        phone.setState(new OffState(phone));
        return phone.lock();
    }
}
