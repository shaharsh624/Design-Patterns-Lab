package DailyCodeBuffer;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new JalapenoDecorator(new CheeseBurstDecorator(new BasePizza()));
        System.out.println("Your Pizza: " + pizza.bake());
    }
}
