package DailyCodeBuffer;

import java.util.*;

public class Swiggy {
    List<Item> items = new ArrayList<>();
    public void addItem(Item item) {
        items.add(item);
        System.out.println(
                "\nItem: " + item.getItemName() +
                "\nPrice: " + item.getPrice() +
                "\nStore: " + item.getRestaurantName()
        );
    }
}
