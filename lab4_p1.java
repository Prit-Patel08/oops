interface Payment {
    void makePayment(double amount);
    void generateReceipt();
    void displayPaymentDetails();
}

class CreditCardPayment implements Payment {
    public void makePayment(double amount) {
        System.out.println("Credit Card payment of ₹" + amount + " made successfully.");
    }
    public void generateReceipt() {
        System.out.println("Credit Card receipt generated.");
    }
    public void displayPaymentDetails() {
        System.out.println("Payment Method: Credit Card");
    }
}

class UPIPayment implements Payment {
    public void makePayment(double amount) {
        System.out.println("UPI payment of ₹" + amount + " made successfully.");
    }
    public void generateReceipt() {
        System.out.println("UPI receipt generated.");
    }
    public void displayPaymentDetails() {
        System.out.println("Payment Method: UPI");
    }
}

class NetBankingPayment implements Payment {
    public void makePayment(double amount) {
        System.out.println("Net Banking payment of ₹" + amount + " made successfully.");
    }
    public void generateReceipt() {
        System.out.println("Net Banking receipt generated.");
    }
    public void displayPaymentDetails() {
        System.out.println("Payment Method: Net Banking");
    }
}

public class lab4_p1 {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCardPayment();
        p.makePayment(5000);
        p.generateReceipt();
        p.displayPaymentDetails();
        System.out.println();
        
        p = new UPIPayment();
        p.makePayment(2500);
        p.generateReceipt();
        p.displayPaymentDetails();
        System.out.println();
        
        p = new NetBankingPayment();
        p.makePayment(10000);
        p.generateReceipt();
        p.displayPaymentDetails();
    }
}
