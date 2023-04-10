

public class GetCarFactory {
    public Car getCar(String carName){
        if (carName == null){
            return null;
        }
        if (carName.equalsIgnoreCase("Alcazar")){
            return new Alcazar();
        }
        else if (carName.equalsIgnoreCase("Swift")){
            return new Swift();
        }
        return null;
    }
}
