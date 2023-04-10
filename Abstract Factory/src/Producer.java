
public class Producer {
    public static AbstractFactory getFactory(String choice){
        if (choice.equals("Car")){
            return new CarFactory();
        }
        else if (choice.equals("Color")){
            return new ColourFactory();
        }
        return null;
    }
}
