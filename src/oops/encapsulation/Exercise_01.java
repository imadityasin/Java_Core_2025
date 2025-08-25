/*
    Q1. Bank Account
    BankAccount class banao jisme:
    Private variables: accountNumber, balance
    Public methods: deposit(), withdraw(), getBalance()
    User ko sirf methods ke through hi balance access/edit karna chahiye.
 */

package oops.encapsulation;

import java.util.Scanner;

class Bank_Account{

    private String accountNumber;
    private double balance=303452;

    public void withdraw(double withdrawamount) {
        double toV=balance-withdrawamount;

        System.out.println("Your Updated Account Balance is = "+balance);
        System.out.println("Please Collect the Cash");

        System.out.println();
        System.out.println();

    }

    public void setBalance(double addmoney) {
        balance=addmoney;
        System.out.println("Transaction Completed");
        System.out.println("Your Updated Account Balance is = "+balance);

        System.out.println();
        System.out.println();
    }

    public void getBalance() {
        System.out.println("Your Updated Account Balance is = "+balance);
    }
}

class Excerise_01 {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Encapsulation Exercise 01 ");

        Bank_Account ba=new Bank_Account();

        while (true) {
            System.out.println("ENTER YOUR CHOICE");
            System.out.println("Enter 1 for Add Money");
            System.out.println("Enter 2 for Check Money");
            System.out.println("Enter 3 for Withdraw Money");
            int choice=sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You Chosen for Add Money");

                    System.out.println("Enter Amount you Want to Add");
                    double addmoney=sc.nextInt();
                    ba.setBalance(addmoney);
                    break;

                case 2:
                    System.out.println("You Chosen for Check Money");

                    ba.getBalance();

                    System.out.println();

                    break;

                case 3:
                    System.out.println("You Chosen for Withdraw Money");

                    System.out.println("Enter Amount you want to Withdraw");
                    double withdrawamount=sc.nextDouble();
                    ba.withdraw(withdrawamount);
                    break;
            }
        }
    }
}
