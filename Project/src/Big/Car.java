package Big;

abstract class Car {
    protected double rate;

    public String color;
    public String fuel;
    public String control;
    public String assistant;
    public int woofers;


    abstract void getPrice();

    public void calculateBill(String color, String fuel, String control, String assistant, int woofers){

        double colorValue;
        double fuelValue;
        double controlValue;
        double assistantValue;
        double woofersValue;

        colorValue = switch (color) {
            case ("Brown") -> 40000;
            case ("White") -> 60000;
            case ("Red") -> 75000;
            case ("Black") -> 90000;
            default -> 38000;
        };

        fuelValue = switch (fuel) {
            case ("Petrol") -> 60000;
            case ("Diesel") -> 50000;
            case ("Electric") -> 40000;
            default -> 40000;
        };

        controlValue = switch (control) {
            case ("Manual") -> 50000;
            case ("Automatic") -> 60000;
            default -> 30000;
        };

        assistantValue = switch (assistant){
            case ("Android Auto") -> 20000;
            case ("CarPlay") -> 40000;
            default -> 10000;
        };

        woofersValue = switch (woofers){
            case (4) -> 32000;
            case (6) -> 48000;
            case (8) -> 64000;
            default -> 32000;
        };

        System.out.println(rate + colorValue + fuelValue + controlValue + assistantValue + woofersValue);

    }
}






/*

package LAB1.package3;

abstract class Car {
    protected double rate;

    public String color;
    public String fuel;

    abstract void getPrice();

    public void calculateBill(String color, String fuel){

        double colorValue;
        double fuelValue;

        colorValue = switch (color) {
            case ("Brown") -> 32000;
            case ("Red") -> 35000;
            case ("White") -> 38000;
            case ("Black") -> 40000;
            default -> 38000;
        };

        fuelValue = switch (fuel) {
            case ("Petrol") -> 45000;
            case ("Diesel") -> 40000;
            case ("Electric") -> 35000;
            default -> 45000;
        };
        System.out.println(rate + colorValue + fuelValue);

    }
}
*/