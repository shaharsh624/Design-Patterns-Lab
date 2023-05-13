package Practice;

public class BurgerFactory {
    public Burger getBurger (String burger){
        if (burger == null) {
            return null;
        } else if(burger.equalsIgnoreCase("BeefBurger")) {
            return new BeefBurger();
        } else if(burger.equalsIgnoreCase("ChickenBurger")) {
            return new ChickenBurger();
        } else if(burger.equalsIgnoreCase("VeggieBurger")) {
            return new VeggieBurger();
        }
        return null;
    }
}
