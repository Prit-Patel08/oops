abstract class BankAccount {
    String accountNumber, customerName;
    double balance;
    final String BANK_NAME = "ABC Bank";
    BankAccount(String acc, String name, double bal) {
        accountNumber = acc;
        customerName = name;
        balance = bal;
    }
    final void displayBankInformation() {
        System.out.println("Bank: " + BANK_NAME);
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    void displayAccountDetails() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Name: " + customerName);
        System.out.println("Balance: " + balance);
    }
    abstract void calculateInterest();
}

class SavingsAccount extends BankAccount {
    double interestRate;
    SavingsAccount(String acc, String name, double bal, double rate) {
        super(acc, name, bal);
        interestRate = rate;
    }
    @Override
    void calculateInterest() {
        System.out.println("Interest: " + (balance * interestRate / 100));
    }
    void displaySavingsAccountDetails() {
        displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class PremiumSavingsAccount extends SavingsAccount {
    double cashbackPercentage;
    PremiumSavingsAccount(String acc, String name, double bal,
                          double rate, double cashback) {
        super(acc, name, bal, rate);
        cashbackPercentage = cashback;
    }
    @Override
    void calculateInterest() {
        System.out.println("Premium Interest: " +
                (balance * (interestRate + 2) / 100));
    }
    void calculateCashback(double amount) {
        System.out.println("Cashback: " +
                (amount * cashbackPercentage / 100));
    }
}

final class BankRules {
    void displayRules() {
        System.out.println("Maintain minimum balance and follow bank rules.");
    }
}

public class lab3_p2 {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("S101", "Rahul", 10000, 5);
        s.deposit(5000);
        s.displaySavingsAccountDetails();
        s.calculateInterest();
        System.out.println();
        PremiumSavingsAccount p = new PremiumSavingsAccount("P101", "Priya", 20000, 6, 3);
        p.deposit(5000);
        p.displaySavingsAccountDetails();
        p.calculateInterest();
        p.calculateCashback(5000);
        System.out.println();
        p.displayBankInformation();
        BankRules r = new BankRules();
        r.displayRules();
    }
}
