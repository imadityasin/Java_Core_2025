//Multi-Level Inheritance.

//Account (Base Class)
//Fields: accountNumber, accHolderName, balance → all private
//
//Methods: setAccountDetails(), displayAccount(), getBalance(), setBalance()
//
//2. SavingsAccount (Intermediate Class)
//Method: withdraw(double amount) → Only if balance is sufficient
//
//3. ATMService (Derived Class)
//Field: pin (hardcoded or set by user)
//
//Method: validatePin()
//
//Method: atmMenu() to show options:
//
//Balance Enquiry
//
//Withdraw Money
//
//Deposit
//
//Money Transfer
//
//Show Account Details

package oops.inheritance;

import java.util.Scanner;

// Base class
class Account1 {
    private long accNumber;
    private String accHolderName;
    private double balance;
    private int pin;

    public void setAccountDetails(long accNumber, String accHolderName, double balance, int pin) {
        this.accNumber = accNumber;
        this.accHolderName = accHolderName;
        this.balance = balance;
        this.pin = pin;
    }

    public boolean validatePin(int enteredPin) {
        return this.pin == enteredPin;
    }

    public void displayAccount() {
        System.out.println("Account Number: " + accNumber);
        System.out.println("Account Holder Name: " + accHolderName);
        System.out.println("Current Balance: ₹" + balance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

// Intermediate class
class SavingsAccount1 extends Account1 {
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("✅ ₹" + amount + " withdrawn successfully.");
            System.out.println("New Balance: ₹" + getBalance());
        } else {
            System.out.println("❌ Insufficient Balance.");
        }
    }
}

// Derived class
class ATMService extends SavingsAccount1 {
    Scanner sc = new Scanner(System.in);

    public void atmMenu() {
        int option;
        do {
            System.out.println("\n------ ATM Menu ------");
            System.out.println("1. Balance Enquiry");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit");
            System.out.println("4. Money Transfer");
            System.out.println("5. Show Account Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Current Balance: ₹" + getBalance());
                    break;
                case 2:
                    System.out.print("Enter Amount to Withdraw: ₹");
                    double amt = sc.nextDouble();
                    withdraw(amt);
                    break;
                case 3:
                    System.out.print("Enter Amount to Deposit: ₹");
                    double dep = sc.nextDouble();
                    setBalance(getBalance() + dep);
                    System.out.println("✅ ₹" + dep + " deposited successfully.");
                    break;
                case 4:
                    System.out.println("Enter Receiver Account Number: ");
                    long rAcc = sc.nextLong();
                    sc.nextLine(); // clear newline
                    System.out.print("Enter Receiver Name: ");
                    String rName = sc.nextLine();
                    System.out.print("Enter IFSC: ");
                    String ifsc = sc.nextLine();
                    System.out.print("Enter Amount to Transfer: ₹");
                    double transfer = sc.nextDouble();
                    if (transfer <= getBalance()) {
                        setBalance(getBalance() - transfer);
                        System.out.println("✅ ₹" + transfer + " transferred to " + rName);
                    } else {
                        System.out.println("❌ Transfer Failed. Insufficient Balance.");
                    }
                    break;
                case 5:
                    displayAccount();
                    break;
                case 6:
                    System.out.println("Thank you for using our ATM. 🏦");
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        } while (option != 6);
    }
}

// Main class
public class Program_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATMService as = new ATMService();

        System.out.println("Welcome to Universal ATM Service");
        System.out.println("Please Insert Your Card");

        // Account setup (normally comes from DB)
        System.out.print("Set Your Account Number: ");
        long accNumber = sc.nextLong();
        sc.nextLine(); // clear buffer
        System.out.print("Set Your Account Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Set Initial Balance: ₹");
        double balance = sc.nextDouble();
        System.out.print("Set a 4-digit PIN: ");
        int pin = sc.nextInt();

        as.setAccountDetails(accNumber, name, balance, pin);

        // PIN validation
        System.out.print("Enter Your PIN to Access ATM: ");
        int enteredPin = sc.nextInt();
        if (as.validatePin(enteredPin)) {
            System.out.println("✅ Access Granted!");
            as.atmMenu();
        } else {
            System.out.println("❌ Incorrect PIN. Access Denied.");
        }
    }
}
