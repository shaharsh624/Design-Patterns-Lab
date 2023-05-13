package Car;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        CarRepository carRepo = new CarRepository();

        for (Iterator iterator = carRepo.getIterator(); iterator.hasNext();) {
            String name = (String)iterator.next();
            System.out.println("Car : " + name);
        }
    }
}
