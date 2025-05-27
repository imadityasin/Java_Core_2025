//Encapsulation.

package oops.encapsulation;

import java.util.Scanner;

class ATM {
    private String accountNumber;
    private int pin;
    private double balance;
    private boolean loggedIn = false;

    public void setCredentials(String accNo, int pin, double balance) {
        this.accountNumber = accNo;
        this.pin = pin;
        this.balance = balance;
    }

    public boolean authenticate(String accNo, int enteredPin) {
        if (this.accountNumber.equals(accNo) && this.pin == enteredPin) {
            System.out.println("Access Granted");
            loggedIn = true;
            return true;
        } else {
            System.out.println("Wrong Credentials");
            return false;
        }
    }

    public void deposit(double amount) {
        if (loggedIn) {
            if (amount > 0) {
                System.out.println("Current Account Balance is: " + balance);
                balance = balance + amount;
                System.out.println("Amount Deposit Successful, Updated Account Balance is: " + balance);
            } else {
                System.out.println("Entered Amount is less than 0 or Zero.");
            }
        } else {
            System.out.println("Please login first.");
        }
    }

    public void withdraw(double amount) {
        if (loggedIn) {
            if (amount > 0 && amount <= balance) {
                System.out.println("Current Account Balance is: " + balance);
                balance = balance - amount;
                System.out.println("Withdraw amount is: " + amount);
                System.out.println("Amount withdraw Successful, Updated Account Balance is: " + balance);
                System.out.println("Please take your cash......");
            } else {
                System.out.println("Entered amount is invalid or exceeds balance.");
            }
        } else {
            System.out.println("Please login first.");
        }
    }

    public double getBalance() {
        if (loggedIn) {
            return balance;
        } else {
            System.out.println("Please login first.");
            return 0.0;
        }
    }

    public String getMaskedAccountNumber() {
        if (accountNumber.length() >= 4) {
            String last4 = accountNumber.substring(accountNumber.length() - 4);
            return "XXXXXX" + last4;
        }
        return "Invalid Account Number";
    }
}

public class Program_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ATM at = new ATM();

        System.out.println("Create Account Number : ");
        String accNo = sc.nextLine();
        System.out.println("Create PIN ");
        int pin = sc.nextInt();
        System.out.println("Create or Initialize Balance");
        double bal = sc.nextDouble();

        at.setCredentials(accNo, pin, bal);

        while (true) {
            System.out.println("\n=======================================");
            System.out.println("Welcome to ATM Service");
            System.out.println("Press 1: Login");
            System.out.println("Press 2: Deposit");
            System.out.println("Press 3: Withdraw");
            System.out.println("Press 4: Check Balance");
            System.out.println("Press 5: Get Masked Account Number");
            System.out.println("Press 6: Exit");

            int choice = sc.nextInt();
            sc.nextLine(); // Flush buffer after nextInt()

            switch (choice) {
                case 1: {
                    System.out.println("Please Enter Your Account Number & Pin to LOGIN.....");
                    System.out.println("Enter Your Account Number");
                    String acx = sc.nextLine();
                    System.out.println("Enter Your PIN");
                    int pii = sc.nextInt();
                    at.authenticate(acx, pii);
                    break;
                }

                case 2: {
                    System.out.println("Amount to Deposit");
                    double depo = sc.nextDouble();
                    at.deposit(depo);
                    break;
                }

                case 3: {
                    System.out.println("Amount to Withdraw");
                    double depo = sc.nextDouble();
                    at.withdraw(depo);
                    break;
                }

                case 4: {
                    System.out.println("Current Balance is = " + at.getBalance());
                    break;
                }

                case 5: {
                    System.out.println("Your Account Number is: " + at.getMaskedAccountNumber());
                    break;
                }

                case 6: {
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    return;
                }

                default: {
                    System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }
}
