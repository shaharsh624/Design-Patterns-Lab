import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Car name[Alcazar, Swift]: ");
        String carName = sc.nextLine();
        System.out.print("Enter the Color[White, Red]: ");
        String color = sc.nextLine();

        AbstractFactory carFactory = Producer.getFactory("Car");
        assert carFactory != null;
        Car car1 = carFactory.getCar(carName);
        car1.getPrice();

        AbstractFactory colorFactory = Producer.getFactory("Color");
        assert colorFactory != null;
        Color color1 = colorFactory.getColor(color);
        color1.getColor();
    }
}
