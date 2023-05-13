package ColorCar;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ColorCar.Car name[ColorCar.Alcazar, ColorCar.Swift]: ");
        String carName = sc.nextLine();
        System.out.print("Enter the ColorCar.Color[ColorCar.White, ColorCar.Red]: ");
        String color = sc.nextLine();

        AbstractFactory carFactory = Producer.getFactory("ColorCar.Car");
        assert carFactory != null;
        Car car1 = carFactory.getCar(carName);
        car1.getPrice();

        AbstractFactory colorFactory = Producer.getFactory("ColorCar.Color");
        assert colorFactory != null;
        Color color1 = colorFactory.getColor(color);
        color1.getColor();
    }
}
