package Car;

import java.util.*;

public class CarShop implements Cloneable {
    private String shopName;
    List<Car> cars = new ArrayList<>();
    public String getshopName(){
        return shopName;
    }
    public void setShopName(String shopName){
        this.shopName = shopName;
    }
    public List<Car> getCars(){
        return cars;
    }
    public void setCars(List<Car> getCars){
        this.cars = cars;
    }

    public void loadData(){
        for (int i=65 ; i<=68 ; i++){
            int flag = 0;

            Car c = new Car();
            c.setModel(String.valueOf(i));
            c.setBrand("Brand"+i);
            c.setEngine("Petrol");
            c.setColor("#FF" + i + flag + "D");
            if (i%2==0){
                flag = 1;
                c.setEngine("Diesel");
                c.setColor("#FF" + i + flag + "D");
            }
              getCars().add(c);
        }
    }
    public String toString(){
        return "\nCar.CarShop ShopName = " + shopName + ", Cars = " + cars;
    }
    protected CarShop clone() throws CloneNotSupportedException {
        CarShop shop =  new CarShop();
        for ( Car c : this.getCars() ){
            shop.getCars().add(c);
        }
        return shop;
    }
}
