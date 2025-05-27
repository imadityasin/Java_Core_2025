//Single-Level Inheritance

//Parent class Account with fields: accountNumber, holderName, balance
//
//Methods: setAccountDetails(), displayAccount()
//
//Child class SavingsAccount with method withdraw(amount) which withdraws only if balance sufficient

package inheritance;

import java.util.Scanner;

class Account{
    private int accountNumber;
    private String accHolderName;
    private double balance;

    public void setAccountDetails(int accountNumber, String accHolderName, double balance) {
        this.accountNumber=accountNumber;
        this.accHolderName=accHolderName;
        this.balance=balance;
    }

    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
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

class SavingsAccount extends Account{
    public void getWithdraw(double amount) {
        if(amount<=getBalance()) {
            setBalance(getBalance()-amount);
            System.out.println("Withdrawal of Amount = ₹"+ amount + " is Successful");
            System.out.println("Remaining Balance : ₹"+getBalance());
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }
}

public class Program_05 {
    public static void main(String[] args) {
//		Creating Scanner class Object for input
        Scanner sc=new Scanner (System.in);

//		Creating child class object for accessing both classes bcz child is inherited
        SavingsAccount sa = new SavingsAccount();

        System.out.println("Enter Your Name: ");
        String name=sc.nextLine();
        System.out.println("Enter Your Account Number: ");
        int accnum=sc.nextInt();
        System.out.println("Enter Your Balance: ");
        double bal=sc.nextInt();
        sa.setAccountDetails(accnum, name, bal);


        System.out.println("Welcome to State Bank of India");
        System.out.println("Please Insert Your Card");
        System.out.println("Now..!! Choose from Below Options: ");
        System.out.println("Press 1 : Balance Enquery");
        System.out.println("Press 2 : Withdrawal");
        System.out.println("Press 3 : Deposit");
        System.out.println("Press 4 : Money Transfer");
        System.out.println("Press 5 : Account Details");
        int option=sc.nextInt();

        switch (option) {
            case 1:
            {
                System.out.println("Your Balance is : "+sa.getBalance());
                break;
            }

            case 2:
            {
                System.out.println("Enter Amount You Want to Withdrawal ");
                double amount=sc.nextInt();
                sa.getWithdraw(amount);
                break;
            }

            case 3:
            {
                System.out.print("How Much Money You Want to Deposit: ₹");
                double amount = sc.nextDouble();
                sa.setBalance(sa.getBalance() + amount);
                System.out.println("✅ ₹" + amount + " Deposited Successfully.");
                System.out.println("New Balance: ₹" + sa.getBalance());
                break;
            }

            case 4:
            {
                System.out.println("\n💸 Money Transfer");
                System.out.println("Enter Receiver Account Details:");

                System.out.print("Enter Account Number: ");
                int accnum1 = sc.nextInt();
                sc.nextLine(); // Flush the newline

                System.out.print("Enter Account Holder Name: ");
                String accname1 = sc.nextLine();

                System.out.print("Enter IFSC Code: ");
                String ifsc = sc.nextLine();

                System.out.print("Enter Amount to Transfer: ₹");
                double amountTransfer = sc.nextDouble();

                if (amountTransfer <= sa.getBalance()) {
                    sa.setBalance(sa.getBalance() - amountTransfer);
                    System.out.println("✅ ₹" + amountTransfer + " Transferred Successfully to " + accname1);
                    System.out.println("New Balance: ₹" + sa.getBalance());
                } else {
                    System.out.println("❌ Insufficient Balance. Transfer Failed.");
                }
                break;
            }

            case 5:
            {
                sa.displayAccount();
                break;
            }

            default:{
                System.out.println("Invalid Input");
            }

        }

    }
}