package Car;

public class Car {
    private String brand;
    private String engine;
    private String color;
    private String model;

    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setEngine(String engine){
        this.engine = engine;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String toString(){
        return "\nCar.Car [Model = " + model + ", Engine = " + engine + ", Color = " + color + ", Brand = " + brand + "]";
    }
}
