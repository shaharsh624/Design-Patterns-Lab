package DailyCodeBuffer;

public class DeliveryBoy {
    String name = "Ashok";

    public void pickupOrder(int orderNo){
        System.out.println(name + " Picked Order " + orderNo);
    }
    public void deliverOrder(int orderNo){
        System.out.println(name + " Delivered Order " + orderNo);
    }
}
