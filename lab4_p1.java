interface Payment {
    void makePayment(double amount);
    void generateReceipt();
    void displayPaymentDetails();
}


class CreditCardPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Credit Card payment of ₹" + amount + " made.");
    }
    @Override
    public void generateReceipt() {
        System.out.println("Credit Card receipt generated.");
    }
    @Override
    public void displayPaymentDetails() {
        System.out.println("Payment Method: Credit Card");
    }
}

class UPIPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("UPI payment of ₹" + amount + " made.");
    }
    @Override
    public void generateReceipt() {
        System.out.println("UPI receipt generated.");
    }
    @Override
    public void displayPaymentDetails() {
        System.out.println("Payment Method: UPI");
    }
}

class NetBankingPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Net Banking payment of ₹" + amount + " made.");
    }
    @Override
    public void generateReceipt() {
        System.out.println("Net Banking receipt generated.");
    }
    @Override
    public void displayPaymentDetails() {
        System.out.println("Payment Method: Net Banking");
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
        System.out.println("--------------------");

        // UPI Payment
        p = new UPIPayment();
        p.makePayment(2500);
        p.generateReceipt();
        p.displayPaymentDetails();
        System.out.println("--------------------");

        // Net Banking Payment
        p = new NetBankingPayment();
        p.makePayment(7500);
        p.generateReceipt();
        p.displayPaymentDetails();
    }
}
