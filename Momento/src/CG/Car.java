package CG;

// The originator class, which is the object whose state we want to save and restore
class Car {
    private String make;
    private String model;
    private int speed;
    private int position;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        this.speed = 0;
        this.position = 0;
    }

    public void accelerate(int speed) {
        this.speed += speed;
    }

    public void move(int distance) {
        this.position += distance;
    }

    public CarMemento saveState() {
        return new CarMemento(make, model, speed, position);
    }

    public void restoreState(CarMemento memento) {
        this.make = memento.getMake();
        this.model = memento.getModel();
        this.speed = memento.getSpeed();
        this.position = memento.getPosition();
    }

    public void printState() {
        System.out.println(make + " " + model + " is currently at speed " + speed + " and position " + position);
    }
}