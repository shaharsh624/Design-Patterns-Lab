package Car;

abstract class Car {
    protected double rate;
    public String color;

    abstract void getPrice();

    public void calculateBill(String color){
        double colorValue = switch (color) {
            case ("Brown") -> 40000;
            case ("White") -> 60000;
            case ("Red") -> 75000;
            case ("Black") -> 90000;
            default -> 38000;
        };

        System.out.println(rate + colorValue);

    }
}
