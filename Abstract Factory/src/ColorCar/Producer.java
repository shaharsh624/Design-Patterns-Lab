package ColorCar;

public class Producer {
    public static AbstractFactory getFactory(String choice){
        if (choice.equals("ColorCar.Car")){
            return new CarFactory();
        }
        else if (choice.equals("ColorCar.Color")){
            return new ColourFactory();
        }
        return null;
    }
}
