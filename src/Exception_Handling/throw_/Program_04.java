/*
Q4. Student Marks Checker
Condition:

Method checkMarks(int marks)

If marks < 0 or > 100 → throw ArithmeticException("Invalid Marks")

Else: print "Valid marks".
*/

package Exception_Handling.throw_;

import java.util.Scanner;

public class Program_04 {
    public static void checkMarks(int marks) {
        if (marks < 0 || marks > 100) {
            throw new ArithmeticException("Invalid Marks: Marks should be between 0 and 100 only.");
        }
        else{
            System.out.println("Valid Marks: " + marks);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number: ");
        int num=sc.nextInt();

        checkMarks(num);
    }
}
