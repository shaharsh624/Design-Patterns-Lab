package Car;

import java.io.*;
public class BuyCar {
    public static void main(String[] args) throws IOException {
        GetCarFactory carFactory = new GetCarFactory();

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        // Name
        System.out.print("Which car you want to buy [Car.Alcazar, Car.Swift]: ");
        String carName =br.readLine();

        System.out.println("Ok! \nPlease Enter the Specifications you need : ");

        // Color
        System.out.print("Color [ Black,Red,White,Brown ] : ");
        String color = br.readLine();

        Car c = carFactory.getCar(carName);

        System.out.print("Your Bill amount for " + carName + " is ");
        c.getPrice();
        c.calculateBill(color);

    }
}
