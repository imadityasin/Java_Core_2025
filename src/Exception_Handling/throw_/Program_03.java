/*
Q3. Even Number Checker
Condition:

Write a method checkEven(int number)

If number is odd, throw IllegalArgumentException with message

Else: print "Even number".
*/

package Exception_Handling.throw_;

import java.util.Scanner;

public class Program_03 {
    public static void checkEven(int number) {
        if (number%2==0) {
            System.out.println("Even Number = "+number);
        }
        else {
            throw new IllegalArgumentException("IllegalArgumentException ODD NUMBER");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Program_03 p3=new Program_03();

        System.out.println("Enter Number");
        int num=sc.nextInt();
        p3.checkEven(num);
    }
}
