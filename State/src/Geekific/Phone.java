package Geekific;

public class Phone {
    private State state;

    public Phone() {
        state = new OffState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public String lock() {
        return "Locking Phone & Turning Off";
    }

    public String home() {
        return "Going to Home Screen";
    }

    public String unLock() {
        return "Unlocking Phone & Going to Home";
    }

    public String turnOn() {
        return "Turning Screen On, Device still Locked";
    }
}
