public class IteratorPatternDemo {
    public static void main(String[] args) {
        CarRepository carRepo = new CarRepository();

        for (Iterator iter = carRepo.getIterator(); iter.hasNext();) {
            String name = (String)iter.next();
            System.out.println("Car : " + name);
        }
    }
}
