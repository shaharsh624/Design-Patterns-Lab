package Geekific;

public abstract class State {
    protected Phone phone;

    public State(Phone phone) {
        this.phone = phone;
    }

    public abstract String OnHome();
    public abstract String OnOffOn();
}
