package Car;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        CarShop cs1 = new CarShop();
        cs1.setShopName("Shop 1");
        cs1.loadData();

        CarShop cs2 = cs1.clone();
        cs2.setShopName("Shop 2");

        cs2.getCars().remove(2);

        System.out.println(cs1);
        System.out.println(cs2);
    }
}
