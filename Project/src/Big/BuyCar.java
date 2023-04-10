package Big;

import java.io.*;
import java.util.*;

public class BuyCar {
    public static void main(String[] args) throws IOException {
        String loop = "Yes";
        while (loop.equals("Yes")){
            GetCarFactory carFactory = new GetCarFactory();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // Brand
            System.out.println("------------------ Welcome to BrandAuto! ------------------");
            System.out.print("----> Car brands\nHonda\nHyundai\nKia\nMahindra\nMarutiSuzuki\nMG\nTata\nToyota" + "\nChoose Brand you want to go with : ");
            String brandName = br.readLine();

            // Car
            String carName;
            switch (brandName) {
                case ("Honda") ->{
                    carName = "HondaCity";
                    System.out.println("\nCar Name: " + carName);
                }
                case ("Kia") -> {
                    carName = "KiaCarens";
                    System.out.println("\nCar Name: " + carName);
                }
                case ("MG") -> {
                    carName = "MGHector";
                    System.out.println("\nCar Name: " + carName);
                }
                case ("Toyota") -> {
                    carName = "ToyotaFortuner";
                    System.out.println("\nCar Name: " + carName);
                }
                case ("Hyundai") -> {
                    System.out.print("-> Enter one of this [HyundaiAlcazar, HyundaiCreta, HyundaiVerna]: ");
                    carName = br.readLine();
                }
                case ("Mahindra") -> {
                    System.out.print("-> Enter one of this [MahindraThar, MahindraXUV700]: ");
                    carName = br.readLine();
                }
                case ("MarutiSuzuki") -> {
                    System.out.print("-> Enter one of this [MarutiSuzukiBaleno, MarutiSuzukiErtiga, MarutiSuzukiSwift]: ");
                    carName = br.readLine();
                }
                case ("Tata") -> {
                    System.out.print("-> Enter one of this [TataHarrier, TataNexon, TataSafari]: ");
                    carName = br.readLine();
                }
                default -> carName = null;
            }

            // Specifications
            System.out.println("\nPlease Enter the Specifications you need : ");

            // Color
            System.out.print("-> Color [ Black,Red,White,Brown ] : ");
            String color = br.readLine();

            // Fuel Type
            System.out.print("-> Fuel Type [ Petrol,Diesel,Electric ] : ");
            String fuel = br.readLine();

            // Control Type
            System.out.print("-> Control Type [ Manual,Automatic ] : ");
            String control = br.readLine();

            // Assistance System
            System.out.print("-> Assistance/Infotainment System [ Android Auto,CarPlay ] : ");
            String assistant = br.readLine();

            // Woofers
            System.out.print("-> No. of Woofers [Range: 4,6,8] : ");
            int woofers = Integer.parseInt(br.readLine());

            Car c = carFactory.getCar(carName);

            System.out.print("\nYour Bill amount for " + carName + " is ");
            c.getPrice();
            c.calculateBill(color, fuel, control, assistant, woofers);

            // Confirmation & Looping
            System.out.print("Please confirm if you want to buy " + carName + " Yes/No : ");
            String confirm = br.readLine();

            if (Objects.equals(confirm, "Yes")) {
                System.out.println("\nCongratulations for your new " + carName + "!");
                loop = "No";
            } else {
                System.out.print("Want to see any other Car [Yes/No] : ");
                loop = br.readLine();
            }
        }
        System.out.println("\nThank You!\nVisit Again");
    }
}

