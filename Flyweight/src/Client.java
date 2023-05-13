import java.util.*;

// Flyweight interface
interface Car {
    void getInfo(String owner, String location, int mileage);
}

// Concrete flyweight class
class CarModel implements Car {
    private final String brand;
    private final String model;
    private final int year;
    private final String color;

    public CarModel(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    
    public void getInfo(String owner, String location, int mileage) {
        System.out.println("\nCar Model: " + brand + " " + model + " " + year + " " + color);
        System.out.println("Current owner: " + owner);
        System.out.println("Current location: " + location);
        System.out.println("Current mileage: " + mileage);
    }
}

// Flyweight factory
class CarFactory {
    private static Map<String, Car> carModels = new HashMap<>();
    public static Car getCarModel(String make, String model, int year, String color) {
        String key = make + model + year + color;
        Car carModel = carModels.get(key);
        if (carModel == null) {
            carModel = new CarModel(make, model, year, color);
            carModels.put(key, carModel);
        }
        return carModel;
    }
}

// Client code
public class Client {
    public static void main(String[] args) {
        Car carModel1 = CarFactory.getCarModel("Toyota", "Fortuner", 2021, "Red");
        Car carModel2 = CarFactory.getCarModel("Toyota", "Camry", 2021, "Red");
        Car carModel3 = CarFactory.getCarModel("Toyota", "Camry", 2021, "Red");

        // Both carModel1 and carModel2 will reference the same CarModel object
        if (carModel2 == carModel3) {
            System.out.println("Car2 and Car3 reference the same CarModel object.");
        }

        carModel1.getInfo("John", "London", 6000);
        carModel2.getInfo("Jane", "Canada", 3000);
        carModel3.getInfo("Andrew", "New York", 5000);
    }
}
