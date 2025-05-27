//Encapsulation.

//2. Bank Account with Balance Check (Intermediate)
//Create a class BankAccount with:
//
//Private fields: accountHolderName, accountNumber, and balance
//
//Public methods:
//
//deposit(double amount)
//
//withdraw(double amount) – only allow if balance is sufficient
//
//getBalance()
//
//Use encapsulation to protect balance from direct access.

package oops.encapsulation;

import java.util.Scanner;

class BankAccount{
    private String accountHolderName;
    private long accountNumber;
    private double balance;

    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName=accountHolderName;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void setDeposit(double amount){
        balance=balance+amount;
        System.out.println("Deposit Successfully Updated Balance is : "+balance);
    }

    public void setWithdraw(double amount){
        if(balance>=amount) {
            balance=balance-amount;
            System.out.println("Amount Withdraw Successfully of ruppes : "+amount);
            System.out.println("Withdraw Successfully Updated Balance is : "+balance);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
}
public class Program_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        BankAccount ba=new BankAccount();

//        Taking values form user because we are studying but this data comes from DB.
        System.out.println("Enter Your Name : ");
        String name=sc.nextLine();
        ba.setAccountHolderName(name);

        System.out.println("Enter Your Account Number : ");
        long accnum= sc.nextLong();
        ba.setAccountNumber(accnum);

        System.out.println("Enter Your Balance : ");
        double bal=sc.nextDouble();
        ba.setBalance(bal);

        System.out.println("Now, we are Redirecting you to ATM Service: ");
        System.out.println("=========================Loading 100%================================");
        System.out.println("==========================Displaying.....===============================");

        System.out.println("Press 1: for DEPOSIT");
        System.out.println("Press 2: for WITHDRAW");
        System.out.println("Press 3: for BALANCE");
        int choice=sc.nextInt();

        switch (choice) {
            case 1: {
                System.out.println("Current Account Balance is : "+ba.getBalance());
                System.out.println("Enter Amount to Deposit : ");
                double amount=sc.nextDouble();
                ba.setDeposit(amount);
                break;
            }

            case 2: {
                System.out.println("Current Account Balance is : "+ba.getBalance());
                System.out.println("Enter Amount To Withdraw : ");
                double amount=sc.nextDouble();
                ba.setWithdraw(amount);
                break;
            }

            case 3: {
                System.out.println("Your Current Savings Account Balance is : "+ba.getBalance());
                break;
            }

            default:{
                System.out.println("Invalid input...please Try Again...!");
            }
        }


    }
}
