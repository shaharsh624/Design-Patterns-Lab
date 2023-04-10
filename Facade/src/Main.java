import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manufacturer manufacturer = new Manufacturer();

        System.out.println("What do you want to manufacture? ");
        System.out.println("1. GearBox \n2. Steering \n3. TaleLight \n4. Tyre");
        System.out.print("Enter your Choice : ");
        int choice = sc.nextInt();
        System.out.println();

        switch (choice) {
            case (1) -> manufacturer.manufactureGearBox();
            case (2) -> manufacturer.manufactureStreering();
            case (3) -> manufacturer.manufactureTaleLight();
            case (4) -> manufacturer.manufactureTyre();
            default -> System.out.println("Enter a Valid Choice!");
        }

    }
}
