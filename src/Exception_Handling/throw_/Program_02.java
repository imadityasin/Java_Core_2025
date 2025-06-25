/*
Q2. Password Validator
Condition:

Write a method validatePassword(String pwd)

If password length < 8, throw IllegalArgumentException

Else: print "Password is strong".
*/

package Exception_Handling.throw_;

import java.util.Objects;
import java.util.Scanner;

class PasswordValidator{
    private String pwd="1803";
    public void setPwd(String pwd1) {
        if (Objects.equals(pwd1, pwd)) {
            System.out.println("Password is Correct Welcome Onboard");
        }
        else{
            throw new IllegalArgumentException("Wrong Credentials");
        }
    }
}

public class Program_02 {
    public static void main(String[] args) {
        PasswordValidator pv=new PasswordValidator();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Password");
        String pwd=sc.nextLine();
        pv.setPwd(pwd);
    }
}
