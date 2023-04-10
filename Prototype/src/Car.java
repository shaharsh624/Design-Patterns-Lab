

public class Car {
    private String brand;
    private String engine;
    private String color;
    private String model;

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getEngine(){
        return engine;
    }
    public void setEngine(String engine){
        this.engine = engine;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public String toString(){
        return "Car [Model = " + model + ", Engine = " + engine + ", Color = " + color + ", Brand = " + brand + "]\n";
    }
}
