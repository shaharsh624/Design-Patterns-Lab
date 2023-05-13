package Car;

public class Car {
    private String color;
    private String fuel;
    private String control;
    private String assistant;
    private int woofers;

    public Car(String color, String fuel, String control, String assistant, int woofers) {
        super();
        this.color = color;
        this.fuel = fuel;
        this.control = control;
        this.assistant = assistant;
        this.woofers = woofers;
    }

    public String toString() {
        return "\nCar.Car [\nColor: " + color + ", \nFuel: " + fuel + ", \nControl: " + control + ", \nAssistant: " + assistant + ", \nWoofers: " + woofers + "\n]";
    }
}
