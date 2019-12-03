package ClassAndObjects;

import java.text.DecimalFormat;

public class BankAccount {
    /*
    Create a class BankAccount
Instance variables: type, accountNumber, balance,
holderName
Methods:

deposit. Method accepts double and it doesn’t return anything. Method should simply print “%double is deposited to your account” and add given double to the balance.

transfer -> accepts double -> Method should print “%double $ is transferred from your account” and decrement balance by given amount.

info -> Method doesn’t accept or return anything. It should simply print the information about the BankAccount as below format
Name: %holderName
Balace: %balance
Type: %type
Account Number: %accountNumber

     */
    private static DecimalFormat df = new DecimalFormat("0.00");
    String type;
    int accountNumber;
    double balance;
    String holderName;

    public void deposit(double deposit) {
        System.out.println(deposit + " is deposited to your account");
        balance += deposit;
        System.out.println("Balance: " + "$" + df.format(balance));
    }
    public void transfer(double transfer) {
        if(transfer > balance) {
            System.out.println("There is not enough money in your account to transfer: " + transfer);
            System.out.println("Balance: " + "$" + df.format(balance));
        }
        else {
            System.out.println(transfer + " is transferred from your account");
            balance -= transfer;
            System.out.println("Balance: " + "$" + df.format(balance));
        }
    }
    public void info() {
        System.out.println("\nName: " + holderName);
        System.out.println("Balance: " + "$" + df.format(balance));
        System.out.println("Type: " + type);
        System.out.println("Account number: " + accountNumber);
    }

}
