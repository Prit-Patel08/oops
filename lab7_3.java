class BankAccount {
    private int balance = 1000;

    synchronized void withdraw(String name, int amount) {
        System.out.println(name + "is trying to withdraw " + amount);
        if (balance >= amount) {
            balance -= amount;
            System.out.println(name + " withdrew " + amount);
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance for " + name);
        }
    }
}

class User extends Thread {
    BankAccount account;
    int amount;
    User(BankAccount account, String name, int amount) {
        super(name);
        this.account = account;
        this.amount = amount;
    }
    public void run() {
        account.withdraw(getName(), amount);
    }
}

public class lab7_3 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        User u1 = new User(account, "Prit", 800);
        User u2 = new User(account, "Pranshu", 300);
        u1.start();
        u2.start();
    }
}
