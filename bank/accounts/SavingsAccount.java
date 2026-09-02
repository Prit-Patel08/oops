package bank.accounts;

import bank.operations.BankOperations;

public class SavingsAccount implements BankOperations {

private int accountNumber;
private double balance;
protected String accountHolderName;

public SavingsAccount(int accountNumber, String accountHolderName, double balance) {
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    this.balance = balance;
}

@Override
public void deposit(double amount) {
    if (amount > 0) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    } else {
        System.out.println("Invalid deposit amount.");
    }
}

@Override
public void withdraw(double amount) {
    if (amount <= 0) {
        System.out.println("Invalid withdrawal amount.");
    } else if (amount <= balance) {
        balance = balance - amount;
        System.out.println("Withdrawn: " + amount);
    } else {
        System.out.println("Insufficient balance.");
    }
}

@Override
public void checkBalance() {
    System.out.println("Current Balance: " + balance);
}

public void displayAccountDetails() {
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Account Holder: " + accountHolderName);
    System.out.println("Balance: " + balance);
}

}
