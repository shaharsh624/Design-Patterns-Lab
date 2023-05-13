package Geekific;

public class ReadyState extends State {
    public ReadyState(Phone phone) {
        super(phone);
    }

    public String OnHome() {
        return phone.home();
    }
    public String OnOffOn() {
        phone.setState(new OffState(phone));
        return phone.lock();
    }
}
