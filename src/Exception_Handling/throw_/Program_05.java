/*
Mobile Number Validator
Condition:

Input mobile number as String

If length ≠ 10 → throw IllegalArgumentException

Else: print "Mobile number is valid".
*/

package Exception_Handling.throw_;

import java.util.Scanner;

public class Program_05 {
    public static void mobileNumber(String num) {
        if(num.length() != 10) {
            throw new IllegalArgumentException("Invalid mobile number: Must be exactly 10 digits.");
        }
        else {
            System.out.println("Mobile number is valid: " + num);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter Your 10 Digit Mobile Number");
        String num=sc.nextLine();
        mobileNumber(num);
    }
}
