package DailyCodeBuffer;

public class GroceryProduct implements GroceryItem {
    String groceryName;
    String price;
    String groceryStore;

    public GroceryProduct(String groceryName, String price, String groceryStore) {
        this.groceryName = groceryName;
        this.price = price;
        this.groceryStore = groceryStore;
    }

    public String getGroceryName() {
        return groceryName;
    }
    public String getPrice() {
        return price;
    }
    public String getGroceryStore() {
        return groceryStore;
    }
}
