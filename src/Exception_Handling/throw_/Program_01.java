//Question:
//Write a method checkAge(int age) that throws an exception if age < 18. Print "Eligible" otherwise.

package Exception_Handling.throw_;

import java.lang.ArithmeticException;
import java.util.Scanner;

public class Program_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter age to check Eligible or not..");
        int age=sc.nextInt();

        if (age>=18) {
            System.out.println(" You are eligible to vote "+age);
        } else {
            throw new ArithmeticException("You are not eligible for vote because age is less then 18.");
        }
    }
}
