package CG;

// Demo - CG.Main
public class Main {
    public static void main(String[] args) {
        // Create a new car and move it forward
        Car car = new Car("Toyota", "Camry");
        car.accelerate(50);
        car.move(100);
        car.printState();

        // Save the current state of the car
        CarMemento memento = car.saveState();

        // Move the car forward again
        car.accelerate(20);
        car.move(50);
        car.printState();

        // Restore the car to its previous state
        car.restoreState(memento);
        car.printState();
    }
}
