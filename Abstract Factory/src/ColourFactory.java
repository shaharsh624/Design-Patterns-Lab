
public class ColourFactory extends AbstractFactory{
    public Color getColor(String color){
        if (color == null){
            return null;
        }
        if (color.equalsIgnoreCase("Red")){
            return new Red();
        }
        else if (color.equalsIgnoreCase("White")){
            return new White();
        }
        return null;
    }
    Car getCar(String carName) {
        return null;
    }
}
