// This program checks if a person is eligible to donate blood based on their age and blood type.

import java.util.Scanner;

public class blood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        
        // Read the age input
        int age = sc.nextInt();

        // Decide if the user is eligible to donate blood based on age
        if (age < 18) {
            System.out.println("You are not eligible to donate blood.");
            sc.close();
            return;
        }
        // Input for blood type
        System.out.println("Enter your blood type (A, B, AB, O): ");
        String bloodType = sc.nextLine().toUpperCase();

        // Determine the blood donation and reception compatibility based on blood type
        switch (bloodType) {
            case "A":
                System.out.println("You can donate to A and AB. You can receive from A and O.");
                break;
            case "B":
                System.out.println("You can donate to B and AB. You can receive from B and O.");
                break;
            case "AB":
                System.out.println("You can donate to AB only. You can receive from A, B, AB, and O.");
                break;
            case "O":
                System.out.println("You can donate to A, B, AB, and O. You can receive from O only.");
                break;
            default:
                System.out.println("Invalid blood type entered.");
        }

        sc.close();
    }
    
}
