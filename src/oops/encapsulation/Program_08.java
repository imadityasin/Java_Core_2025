//SELF PRACTICE QUESTION.

package oops.encapsulation;

import java.util.Scanner;

class ATM_Machine{
    private int pin;

    void setPin(int pin) {
        this.pin=pin;
    }

    void getPin(int pin1) {
        if (pin1==pin) {
            System.out.println("Approved ");
            System.out.println("Welcome Aditya Singh");
            System.out.println("Select Menu: ");
            System.out.println("Cash Withdrawal");
            System.out.println("Balance Enquiry");
            System.out.println("Exit");
        } else {
            System.out.println("Wrong Credentials");
        }
    }

}
public class Program_08 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        ATM_Machine atm=new ATM_Machine();

        System.out.println("SET NEW PIN");
        int pin=sc.nextInt();
        atm.setPin(pin);

        System.out.println("WELCOME TO SBI");
        System.out.println("Please Insert your card and enter your pin: ");
        int pin1=sc.nextInt();
        atm.getPin(pin1);

    }
}
