package bank.application;

import bank.accounts.SavingsAccount;

public class BankApplication {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(101, "Rahul", 5000.0);

        account.deposit(2000.0);

        account.withdraw(1000.0);

        account.checkBalance();

        account.displayAccountDetails();
    }
}
