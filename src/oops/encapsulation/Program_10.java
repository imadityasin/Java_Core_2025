/* Write a Java program to create a class called BankAccount with private instance variables accountNumber and balance.
Provide public getter and setter methods to access and modify these variables. */

package oops.encapsulation;

import java.util.Scanner;

class BankAccount_01{
    private long accountNumber=307200150;
    private long balance=96359752;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}

public class Program_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BankAccount_01 ba=new BankAccount_01();

//        If you want to access the accountNumber and balance.
        System.out.println("Account Number is = "+ ba.getAccountNumber());
        System.out.println("Balance is = "+ ba.getBalance());

//        If you want to modify the account number and balance.
        System.out.println("You want to modify the account number and balance...?");
        System.out.println("Then Press 1 if not then press any number");
        int choice= sc.nextInt();

        if (choice==1) {
            System.out.println("Your Savings Account Number is "+ba.getAccountNumber());
            System.out.println("Your Savings Account Balance is "+ba.getBalance());
            System.out.println();
            System.out.println("Now Modify the account number enter accountNumber");
            long acc=sc.nextLong();
            ba.setAccountNumber(acc);
            System.out.println("Now Modify the account balance enter accountBalance");
            long accBal=sc.nextLong();
            ba.setBalance(accBal);

            System.out.println("Account Number is : "+ba.getAccountNumber());
            System.out.println("Account Balance is : " +ba.getBalance());
        } else {
            System.out.println("Ok, GoodBye....!");
        }

    }
}