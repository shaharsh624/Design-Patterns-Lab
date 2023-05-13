public class SingleTon {
    public static void main(String[] args) {
        Audi obj1 = Audi.getInstance();
        Audi obj2 = Audi.getInstance();
    }
 }

class Audi {
    private static Audi obj = new Audi();
    private Audi() {
        System.out.println("This is Audi Q3");
    }
    public static Audi getInstance() {
        return obj;
    }
}
