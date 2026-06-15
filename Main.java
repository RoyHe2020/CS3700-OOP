// Main.java — Module 1 Assignment 2: Calculations and Input/Output
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number (x): ");
        double x = input.nextDouble();

        System.out.print("Enter the second number (y): ");
        double y = input.nextDouble();

        System.out.println();
        System.out.println("===== Arithmetic Results =====");
        System.out.printf("%-20s %.2f + %.2f  = %.2f%n",  "Addition:",       x, y, x + y);
        System.out.printf("%-20s %.2f - %.2f  = %.2f%n",  "Subtraction:",    x, y, x - y);
        System.out.printf("%-20s %.2f * %.2f  = %.2f%n",  "Multiplication:", x, y, x * y);

        if (y != 0) {
            System.out.printf("%-20s %.2f / %.2f  = %.2f%n", "Division:", x, y, x / y);
        } else {
            System.out.println("Division:            Cannot divide by zero.");
        }
        System.out.println("==============================");

        input.close();
    }
}
