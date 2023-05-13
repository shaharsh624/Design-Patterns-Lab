package DailyCodeBuffer;

public class GroceryAdapter implements Item{
    private final GroceryItem groceryItem;

    public GroceryAdapter(GroceryItem groceryItem) {
        this.groceryItem = groceryItem;
    }

    public String getItemName() {
        return groceryItem.getGroceryName();
    }
    public String getPrice() {
        return groceryItem.getPrice();
    }
    public String getRestaurantName() {
        return groceryItem.getGroceryStore();
    }
}
