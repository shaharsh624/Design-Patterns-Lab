package Evaluation2;

import java.util.*;

public class AdnissionPage {
    public static void main(String[] args) {

        String loop = "Yes";
        while (loop.equals("Yes")) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            System.out.print("Enter School: ");
            String school = sc.nextLine();

            System.out.print("Enter Program: ");
            String program = sc.nextLine();

            System.out.print("Enter Branch: ");
            String branch = sc.nextLine();

            System.out.print("Enter latest Marks: ");
            int marks = sc.nextInt();


            Student st1 = new NewStudent()
                    .setName(name)
                    .setEmail(email)
                    .setSchool(school)
                    .setProgram(program)
                    .setBranch(branch)
                    .setMarks(marks)
                    .getStudent();
            System.out.println(st1);


            // Confirmation & Looping
            System.out.print("Please Confirm the details Yes/No : ");
            String confirm = sc.nextLine();

            if (Objects.equals(confirm, "Yes")) {
                System.out.println("\nThe Details are stored!");
                loop = "No";
            } else {
                System.out.print("Want to add other students details [Yes/No] : ");
                loop = sc.nextLine();
            }
        }
    }
}
