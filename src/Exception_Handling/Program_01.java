//  Write a program to handle ArithmeticException when dividing by zero.

package Exception_Handling;

public class Program_01 {
    public static void main(String[] args) {
        int a = 7;
        int b = 0;

        try {
            int result = a / b; // Risky code
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Program continues after exception handling.");
    }
}