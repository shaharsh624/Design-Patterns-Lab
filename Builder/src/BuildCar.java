
public class BuildCar {

    private String color;
    private String fuel;
    private String control;
    private String assistant;
    private int woofers;

    public BuildCar setColor(String color){
        this.color = color;
        return this;
    }
    public BuildCar setFuel(String fuel){
        this.fuel = fuel;
        return this;
    }
    public BuildCar setControl(String control) {
        this.control = control;
        return this;
    }
    public BuildCar setAssistent(String assistant){
        this.assistant = assistant;
        return this;
    }
    public BuildCar setWoofers(int woofers) {
        this.woofers = woofers;
        return this;
    }
    public Car getCar(){
        return new Car(color, fuel, control, assistant, woofers);
    }
}
