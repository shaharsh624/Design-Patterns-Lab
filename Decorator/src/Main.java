interface Car {
    void decorate();
}
class BMWX50 implements Car {
    public void decorate() {
        System.out.println("Car: BMWX50");
    }
}

class MercedezAClass implements Car {
    public void decorate() {
        System.out.println("Car: MercedezAClass");
    }
}

abstract class carDecorator implements Car {
    protected Car decoratedCar;
    public carDecorator(Car decoratedCar){
        this.decoratedCar = decoratedCar;
    }
    public void decorate(){
        decoratedCar.decorate();
    }
}

class RedCarDecorator extends carDecorator {
    public RedCarDecorator(Car decoratedCar) {
        super(decoratedCar);
    }
    public void decorate() {
        decoratedCar.decorate();
        setRedColor(decoratedCar);
    }
    private void setRedColor(Car decoratedCar){
        System.out.println("Car Color: Red");
    }
}

public class Main {
    public static void main(String[] args) {

        Car mercedezAClass = new MercedezAClass();
        Car bmwX50 = new BMWX50();

        Car redMercedezAClass = new RedCarDecorator(new MercedezAClass());
        Car redBMWX50 = new RedCarDecorator(new BMWX50());

        System.out.println("\nBMW X-50 with white Color");
        bmwX50.decorate();

        System.out.println("\nMercedez A-Class with white Color");
        mercedezAClass.decorate();

        System.out.println("\nBMW X-50 of red color");
        redMercedezAClass.decorate();

        System.out.println("\nMercedez A-Class of red color");
        redBMWX50.decorate();
    }
}
