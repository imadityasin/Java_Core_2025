//Q1: Declare an exception using throws (Thread.sleep)
//Write a method wait2Seconds() that sleeps the thread for 2 seconds. Use throws to declare the exception.
//Hint: Use Thread.sleep(2000);
package Exception_Handling;

import java.util.Scanner;

public class Program_07 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc=new Scanner(System.in);
        int pin=4543;

        System.out.println("Welcome To SBI ATM");
        System.out.println();

        System.out.println("Enter 4-Digit Pin");
        int pinClone=sc.nextInt();
        System.out.println();
        System.out.println("Validating.....");
        System.out.println("Please wait");

        Thread.sleep(2000);

        System.out.println();
        System.out.println();

        if(pin==pinClone) {
            System.out.println(" Welcome Aditya ");
            System.out.println(" Account Balance is = 36842612");
        } else {
            System.out.println("Bkl Hai koun tu ge gadarfand macha rrakhaya......?");
        }
    }
}
