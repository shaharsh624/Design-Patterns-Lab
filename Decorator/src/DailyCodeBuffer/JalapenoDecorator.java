package DailyCodeBuffer;

public class JalapenoDecorator extends PizzaDecorator{
    public JalapenoDecorator(Pizza pizza) {
        super(pizza);
    }
    public String bake(){
        return pizza.bake() + addJalapeno();
    }
    public String addJalapeno(){
        return " + Jalapeno";
    }
}
