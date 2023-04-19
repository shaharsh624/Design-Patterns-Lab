package CG;

// The momento class, which is responsible for storing the state of the originator
class CarMemento {
    private String make;
    private String model;
    private int speed;
    private int position;

    public CarMemento(String make, String model, int speed, int position) {
        this.make = make;
        this.model = model;
        this.speed = speed;
        this.position = position;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPosition() {
        return position;
    }
}