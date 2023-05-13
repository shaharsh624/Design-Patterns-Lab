// Subject interface
interface Car {
    void start();
}

// Real subject
class RealCar implements Car {
    public void start() {
        System.out.println("Starting the car");
    }
}

// Proxy
class CarProxy implements Car {
    private RealCar realCar;
    private boolean isCarReady;

    public void start() {
        if (realCar == null) {
            realCar = new RealCar();
        }
        if (isCarReady()) {
            realCar.start();
        }
    }

    private boolean isCarReady() {
        if (!isCarReady) {
            System.out.println("Checking the car's status...");
            int fuelLevel = checkFuelLevel();
            int tirePressure = checkTirePressure();
            int engineTemperature = checkEngineTemperature();
            isCarReady = fuelLevel > 0 && tirePressure > 0 && engineTemperature < 100;
        }
        return isCarReady;
    }

    private int checkFuelLevel() {
        // Perform checks to determine the fuel level
        int fuelLevel = 50; // Set to 50 for demonstration purposes only
        System.out.println("Fuel level: " + fuelLevel);
        return fuelLevel;
    }

    private int checkTirePressure() {
        // Perform checks to determine the tire pressure
        int tirePressure = 30; // Set to 30 for demonstration purposes only
        System.out.println("Tire pressure: " + tirePressure);
        return tirePressure;
    }

    private int checkEngineTemperature() {
        // Perform checks to determine the engine temperature
        int engineTemperature = 90; // Set to 90 for demonstration purposes only
        System.out.println("Engine temperature: " + engineTemperature);
        return engineTemperature;
    }
}

// Client code
public class Client {
    public static void main(String[] args) {
        Car car = new CarProxy();
        car.start();
    }
}
