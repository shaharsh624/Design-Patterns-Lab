package DailyCodeBuffer;

import java.util.*;

public class ZomatoFacade {
    private final Restaurant restaurant;
    private final DeliveryPartner deliveryPartner;
    private final DeliveryBoy deliveryBoy;

    public ZomatoFacade() {
        restaurant = new Restaurant();
        deliveryPartner = new DeliveryPartner();
        deliveryBoy = new DeliveryBoy();
    }

    public void orderFood(int orderNo){
        List<Integer> orders = new ArrayList<>();
        orders.add(orderNo);
        restaurant.prepareFood(orderNo);
        deliveryPartner.assignDeliveryBoy(orderNo);
        deliveryBoy.pickupOrder(orderNo);
        deliveryBoy.deliverOrder(orderNo);
    }
}
