//import java.awt.*;
//import java.util.HashMap;
//import java.util.Map;
//import javax.swing.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class FlyweightPattern {
//    static int Canvas_Size = 500;
//    static int Cars_To_Draw = 200000;
//    static int Car_Types = 2;
//    public static void main(String[] args) {
//        CarFactory carFactory = new CarFactory();
//        CarShowroom carShowroom = new CarShowroom();
//        for(int i = 0; i < Math.floor(Cars_To_Draw / Car_Types); i ++) {
//            carShowroom.addCar(carFactory.createCar("Sedan", "White", "Toyota"));
//            carShowroom.addCar(carFactory.createCar("SUV", "Black", "Ford"));
//        }
//        carShowroom.setSize(Canvas_Size, Canvas_Size);
//        carShowroom.setVisible(true);
//
//        System.out.println(Cars_To_Draw + " cars drawn");
//        System.out.println("--------------------------");
//        System.out.println("Memory Usage: ");
//        System.out.println("Car size (8 bytes) * " + Cars_To_Draw);
//        System.out.println("+ CarTypes size (-30 bytes) * " + Car_Types + " ");
//        System.out.println("--------------------------");
//        System.out.println("Total: " + ((Cars_To_Draw * 8 + Car_Types * 30) / 1024 / 1024) + "MB instead of " + ((Cars_To_Draw * 38) / 1024 / 1024) + "MB");
//    }
//
//    private static int random(int min, int max) {
//        return min + (int) (Math.random() * ((max - min) + 1));
//    }
//}
//
//class Car {
//    private int x;
//    private int y;
//    private CarType type;
//
//    public Car(int x, int y, CarType type) {
//        this.x = x;
//        this.y = y;
//        this.type = type;
//    }
//
//    public void draw(Graphics g) {
//        type.draw(g, x, y);
//    }
//}
//
//class CarType {
//    private String name;
//    private Color color;
//    private String make;
//
//    public CarType(String name, Color color, String make) {
//        this.name = name;
//        this.color = color;
//        this.make = make;
//    }
//
//    public void draw(Graphics g, int x, int y) {
//        g.setColor(Color.BLACK);
//        g.fillRect(x - 1, y, 3, 5);
//        g.setColor(color);
//        g.fillOval(x - 5, y - 10, 10, 10);
//    }
//}
//
//class CarFactory {
//    static Map<String, CarType> carTypes = new HashMap<>();
//
//    public CarType createCar(String name, String color, String make) {
//        Color carColor = Color.decode(color);
//        String carTypeKey = name + make + color;
//        CarType result = carTypes.get(carTypeKey);
//        if(result == null) {
//            result = new CarType(name, carColor, make);
//            carTypes.put(carTypeKey, result);
//        }
//        return result;
//    }
//}
//
//class CarShowroom extends JFrame {
//    private List<Car> cars = new ArrayList<>();
//
//    public void addCar(Car car) {
//        cars.add(car);
//    }
//
//    public void paint(Graphics graphics) {
//        for(Car car: cars) {
//            car.draw(graphics);
//        }
//    }
//}
