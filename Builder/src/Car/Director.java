package Car;

public class Director {
    public void buildElectric(BuildCar builder) {
        builder.setFuel("Electric")
                .setControl("Automatic")
                .setAssistant("Car.Car Play");
    }
    public void buildPetrol(BuildCar builder) {
        builder.setFuel("Petrol")
                .setControl("Manual")
                .setAssistant("Android Auto");
    }
}
