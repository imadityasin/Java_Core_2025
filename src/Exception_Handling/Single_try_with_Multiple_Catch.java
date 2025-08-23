/*
    Java Exception Handling Question (Single try with Multiple Catch).

    Write a Java program that does the following:
    1. Ask the user to input two numbers and perform division.
    2. Create an array of size 3, ask the user to enter 3 values, and then try to access the 5th index.
    3. Ask the user to enter a string that should be a number and convert it to an integer.

    Your program must use:
    A single try block
    Multiple catch blocks to handle:
    ArithmeticException
    ArrayIndexOutOfBoundsException
    NumberFormatException

    ❗ Rules:
    Do not use multiple try blocks.
    Use one try and multiple catch.

    Also add a generic catch block for any unexpected exception.
*/

package Exception_Handling;

import java.util.Scanner;

import java.lang.ArithmeticException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.NumberFormatException;


public class Single_try_with_Multiple_Catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // 1. ArithmeticException
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int c = a / b;
            System.out.println("Result of division: " + c);

            // 2. ArrayIndexOutOfBoundsException
            int[] arr1 = new int[3];
            System.out.println("Enter 3 values for the array:");

            for (int i = 0; i < arr1.length; i++) {
                System.out.print("Value at index " + i + ": ");
                arr1[i] = sc.nextInt();
            }

            System.out.print("Enter index to access (0 to 2): ");
            int index = sc.nextInt();
            System.out.println("Value at index " + index + ": " + arr1[index]);

            sc.nextLine(); // clear buffer

            // 3. NumberFormatException
            System.out.print("Enter a number as a string: ");
            String input = sc.nextLine();

            int number = Integer.parseInt(input);
            System.out.println("Converted string to number: " + number);

        } catch (ArithmeticException e) {
            System.out.println("❌ ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("❌ ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("❌ NumberFormatException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ Some other Exception occurred: " + e.getMessage());
        }

        sc.close();
    }
}