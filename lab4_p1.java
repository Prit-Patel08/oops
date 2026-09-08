interface Payment {
    void makePayment(double amount);
    void generateReceipt();
    void displayPaymentDetails();
}

class CreditCardPayment implements Payment {
    private double amount;
    @Override
    public void makePayment(double amount) {
        this.amount = amount;
        System.out.println("Credit Card Payment of ₹" + amount + " made successfully.");
    }
    @Override
    public void generateReceipt() {
        System.out.println("Credit Card receipt generated.");
    }
    @Override
    public void displayPaymentDetails() {
        System.out.println("Payment Method: Credit Card");
        System.out.println("Amount: ₹" + amount);
    }
}

class UPIPayment implements Payment {
    private double amount;
    @Override
    public void makePayment(double amount) {
        this.amount = amount;
        System.out.println("UPI Payment of ₹" + amount + " made successfully.");
    }
    @Override
    public void generateReceipt() {
        System.out.println("UPI receipt generated.");
    }
    @Override
    public void displayPaymentDetails() {
        System.out.println("Payment Method: UPI");
        System.out.println("Amount: ₹" + amount);
    }
}

class NetBankingPayment implements Payment {
    private double amount;
    @Override
    public void makePayment(double amount) {
        this.amount = amount;
        System.out.println("Net Banking Payment of ₹" + amount + " made successfully.");
    }
    @Override
    public void generateReceipt() {
        System.out.println("Net Banking receipt generated.");
    }
    @Override
    public void displayPaymentDetails() {
        System.out.println("Payment Method: Net Banking");
        System.out.println("Amount: ₹" + amount);
    }
}

public class Main {
    public static void main(String[] args) {
        Payment p;
        // Credit Card Payment
        p = new CreditCardPayment();
        p.makePayment(5000);
        p.generateReceipt();
        p.displayPaymentDetails();
        System.out.println("----------------------------");

        // UPI Payment
        p = new UPIPayment();
        p.makePayment(2500);
        p.generateReceipt();
        p.displayPaymentDetails();
        System.out.println("----------------------------");

        // Net Banking Payment
        p = new NetBankingPayment();
        p.makePayment(7500);
        p.generateReceipt();
        p.displayPaymentDetails();
    }
}
