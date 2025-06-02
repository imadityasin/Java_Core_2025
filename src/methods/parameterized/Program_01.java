//Parameterized Method

//Write a Java class Calculator that contains the following:
//
//A parameterized method add(int a, int b) that returns the sum of two numbers.
//
//A parameterized method multiply(int a, int b) that returns the product of two numbers.
//
//Then, in the main method, call both methods with sample inputs and print the results.
package methods.parameterized;

import java.util.Scanner;

public class Program_01 {
//    add method parameterized
    public static void  add(int a, int b) {
        System.out.println("Values after Addition" + a+b);
    }

//    multiply method parameterized.
    public static void multiply(int a, int b) {
        System.out.println("Values after Multiplication" + a*b);
    }

    public static void main(String[] args) {
//        Scanner class object for taking user input
        Scanner sc=new Scanner(System.in);

//        Taking values from user.
        System.out.println("Enter value 1: ");
        int a=sc.nextInt();
        System.out.println("Enter value 2: ");
        int b=sc.nextInt();

//        Calling methods and passing values.
        add(a,b);
        multiply(a,b);
    }
}
