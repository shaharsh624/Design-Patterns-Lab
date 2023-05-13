package DailyCodeBuffer;

public class FoodItem implements Item{
    String itemName;
    String price;
    String restaurantName;

    public FoodItem(String itemName, String price, String restaurantName) {
        this.itemName = itemName;
        this.price = price;
        this.restaurantName = restaurantName;
    }

    public String getItemName() {
        return itemName;
    }
    public String getPrice() {
        return price;
    }
    public String getRestaurantName() {
        return restaurantName;
    }
}
