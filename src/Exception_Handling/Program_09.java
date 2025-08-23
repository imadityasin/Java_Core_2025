/*
Problem Statement:
Write a Java program that performs the following tasks:
Ask the user to input two numbers and divide them (handle ArithmeticException if the denominator is zero).
Ask the user to enter a string and print its length (handle NullPointerException if the user enters null).
Ask the user to enter a number in string format and convert it to an integer (handle NumberFormatException).
*/

package Exception_Handling;

import java.util.Scanner;
import java.lang.ArithmeticException;
import java.lang.NullPointerException;
import java.lang.NumberFormatException;

public class Program_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Handling ArithmeticException
        System.out.println("---- ArithmeticException Example ----");
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        try {
            int result = a / b;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        sc.nextLine(); // clear buffer

        // 2. Handling NullPointerException
        System.out.println("\n---- NullPointerException Example ----");
        System.out.print("Enter a string (type 'null' to simulate null value): ");
        String input = sc.nextLine();

        try {
            if (input.equals("null")) {
                input = null; // manually assigning null
            }
            System.out.println("Lowercase: " + input.toLowerCase());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }

        // 3. Handling NumberFormatException
        System.out.println("\n---- NumberFormatException Example ----");
        System.out.print("Enter a number in string format: ");
        String numStr = sc.nextLine();

        try {
            int number = Integer.parseInt(numStr);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }

        sc.close();
    }
}
