
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
        return "Car [Color: " + color + ", Fuel: " + fuel + ", Control: " + control + ", Assistant: " + assistant + ", Woofers: " + woofers + "]";
    }
}

