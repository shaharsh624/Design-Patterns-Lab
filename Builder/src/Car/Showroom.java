package Car;

public class Showroom {
    public static void main(String[] args) {
        Director director = new Director();

        Car c1 = new BuildCar()
                .setColor("Red")
                .setFuel("Electric")
                .setControl("Automatic")
                .setAssistant("Android Auto")
                .setWoofers(8)
                .getCar();
        System.out.println(c1);

        BuildCar builder1 = new BuildCar();
        director.buildElectric(builder1);
        Car c2 = builder1.setColor("Black").setWoofers(10).getCar();
        System.out.println(c2);

        BuildCar builder2 = new BuildCar();
        director.buildPetrol(builder2);
        Car c3 = builder2.setColor("Grey").setWoofers(4).getCar();
        System.out.println(c3);
    }
}
