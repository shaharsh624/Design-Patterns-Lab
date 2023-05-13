package DailyCodeBuffer;

public class Customer {
    public static void main(String[] args) {

    Swiggy swiggy = new Swiggy();

    FoodItem foodItem1 = new FoodItem("Cheeseburger", "$9.99", "Burger Joint");
    FoodItem foodItem2 = new FoodItem("Margherita Pizza", "$14.50", "Pizza Palace");

    swiggy.addItem(foodItem1);
    swiggy.addItem(foodItem2);

    GroceryProduct groceryProduct1 = new GroceryProduct("Milk", "$2.99", "SuperMart");
    GroceryProduct groceryProduct2 = new GroceryProduct("Bread", "$3.49", "MarketBasket");

    GroceryAdapter adapter1 = new GroceryAdapter(groceryProduct1);
    GroceryAdapter adapter2 = new GroceryAdapter(groceryProduct2);

    swiggy.addItem(adapter1);
    swiggy.addItem(adapter2);
    }
}
