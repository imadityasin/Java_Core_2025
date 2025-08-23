/*
    Here’s a super coding challenge that covers all major exceptions.
    Create a Java program that performs different tasks and handles the following exceptions:

Exception	                     --->       Trigger Condition.
ArithmeticException	             --->       Divide a number by 0.
NullPointerException	         --->       Call a method on a null object.
ArrayIndexOutOfBoundsException	 --->       Access an invalid index in an array.
NumberFormatException	         --->       Convert an invalid string to a number.
FileNotFoundException	         --->       Try to open a non-existent file.
ClassCastException	             --->       Cast an object to the wrong type.

Ask the user to enter two numbers and divide them.
→ If second number is 0, throw ArithmeticException.

Create a string and set it to null, then call .length() on it.
→ Triggers NullPointerException.

Declare an array of size 3 and try to access index 5.
→ Triggers ArrayIndexOutOfBoundsException.

Ask user to input a string and convert it to integer.
→ Input like "abc" triggers NumberFormatException.

Try to read a file named "data.txt" that doesn't exist.
→ Triggers FileNotFoundException.

Perform wrong casting, like casting an Object holding Integer to String.
→ Triggers ClassCastException.

*/
package Exception_Handling;

import java.util.Scanner;
import java.io.File;

import java.lang.ArithmeticException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.NumberFormatException;
import java.lang.ClassCastException;
import java.lang.NullPointerException;
import java.io.FileNotFoundException;

public class All_Exception_In_One_Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. ArithmeticException
        System.out.println("\n[1] ArithmeticException");
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        try {
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        sc.nextLine(); // clear buffer

        // 2. NullPointerException
        System.out.println("\n[2] NullPointerException");
        String name = null;
        try {
            System.out.println("Uppercase name: " + name.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }

        // 3. ArrayIndexOutOfBoundsException
        System.out.println("\n[3] ArrayIndexOutOfBoundsException");
        int[] arr = new int[3];

        try {
            System.out.println("Enter 3 values for array:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Value at index " + i + ": ");
                arr[i] = sc.nextInt();
            }

            System.out.println("Accessing invalid index 5:");
            System.out.println(arr[5]);  // invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        sc.nextLine(); // clear buffer

        // 4. NumberFormatException
        System.out.println("\n[4] NumberFormatException");
        System.out.print("Enter a number in string format: ");
        String numStr = sc.nextLine();

        try {
            int number = Integer.parseInt(numStr);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }

        // 5. FileNotFoundException
        System.out.println("\n[5] FileNotFoundException");
        File file = new File("data.txt");

        try {
            Scanner fileScanner = new Scanner(file); // file doesn't exist
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: " + e.getMessage());
        }

        // 6. ClassCastException
        System.out.println("\n[6] ClassCastException");

        try {
            Object obj = Integer.valueOf(42);  // holds Integer
            String str = (String) obj;         // invalid cast to String
            System.out.println(str);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }

        sc.close();
    }
}
