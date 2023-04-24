import java.util.HashMap;
import java.util.Map;

// Flyweight interface
interface Car {
    void getInfo(String owner, String location, int mileage);
}

// Concrete flyweight class
class CarModel implements Car {
    private String make;
    private String model;
    private int year;
    private String color;

    public CarModel(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    
    public void getInfo(String owner, String location, int mileage) {
        System.out.println("\nCar Model: " + make + " " + model + " " + year + " " + color);
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
        Car car1 = CarFactory.getCarModel("Toyota", "Fortuner", 2021, "Red");
        Car car2 = CarFactory.getCarModel("Toyota", "Camry", 2021, "Red");

        // Both car1 and car2 will reference the same CarModel object
        if (car1 == car2) {
            System.out.println("Car1 and Car2 reference the same CarModel object");
        }

        car1.getInfo("John", "London", 6000);
        car2.getInfo("Jane", "Canada", 3000);
        car2.getInfo("Andrew", "New York", 5000);
    }
}
