package Car;

public class GetCarFactory {
    public Car getCar(String carName){
        if (carName == null){
            return null;
        }
        if (carName.equalsIgnoreCase("Car.Alcazar")){
            return new Alcazar();
        }
        else if (carName.equalsIgnoreCase("Car.Swift")){
            return new Swift();
        }
        return null;
    }
}
