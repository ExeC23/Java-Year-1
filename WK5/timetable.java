// This program prompts the user to enter their class year and then displays the modules and exam times for that year. It uses a switch statement to determine which modules and exam times to display based on the user's input.
import java.util.Scanner;

public class timetable {
    public static void main(String [] args) {
        // Prompt the user to enter their class year
        System.out.println("Enter your class year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        // Use a switch statement to determine which modules and exam times to display based on the user's input
        switch (year) {
            case 1:
                System.out.println("Intro to Programming is a year one module. Exam is at 11am on Monday.");
                break;
            case 2:
                System.out.println("Object Oriented Programming is a year two module. Exam is at 9am on Monday.");
                System.out.println("Data Structures is a year two module. Exam is at 1pm on Wednesday.");
                System.out.println("Web Development is a year two module. Exam is at 2pm Thursday.");
                break;
            default:
            // If the user enters a class year that is not 1 or 2, display an error message
            System.out.println("Invalid class year entered.");
        }
    }
}
