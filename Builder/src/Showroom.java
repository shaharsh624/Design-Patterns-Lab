
public class Showroom {
    public static void main(String[] args) {
        Car c1 = new BuildCar()
                .setColor("Red")
                .setFuel("Electric")
                .setControl("Automatic")
                .setAssistent("Android Auto")
                .setWoofers(8)
                .getCar();
        System.out.println(c1);

        Car c2 = new BuildCar()
                .setColor("White")
                .setFuel("Petrol")
                .setControl("Manual")
                .setAssistent("CarPlay")
                .getCar();
        System.out.println(c2);
    }
}
