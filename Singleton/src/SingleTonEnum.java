
public class SingleTonEnum {
    public static void main(String[] args) {
        Mercedes obj1 = Mercedes.INSTANCE;

        obj1.setI(4200000);
        System.out.println("Price of Mercedes-Benz A-Class: " + obj1.getI());

        Mercedes obj2 = Mercedes.INSTANCE;
        obj2.setI(5000000);
        System.out.println("Price of Mercedes-Benz GLA Class: " + obj2.getI());
    }
}

enum Mercedes {
    INSTANCE;
    int i;
    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }
}
