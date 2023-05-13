package Practice;

public class Restaurant {
    public static void main(String[] args) {
        BurgerFactory factory = new BurgerFactory();

        Burger b1 = factory.getBurger("VeggieBurger");
        b1.prepare();
    }
}
