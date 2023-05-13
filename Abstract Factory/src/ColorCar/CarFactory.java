package ColorCar;

public class CarFactory extends AbstractFactory{
    public Car getCar(String carName){
        if (carName == null){
            return null;
        }
        if (carName.equalsIgnoreCase("ColorCar.Alcazar")){
            return new Alcazar();
        }
        else if (carName.equalsIgnoreCase("ColorCar.Swift")){
            return new Swift();
        }
        return null;
    }
    Color getColor(String color) {
        return null;
    }
}
