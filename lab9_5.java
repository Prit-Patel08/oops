class Inventory {
    public boolean checkStock(String item) {
        System.out.println("Stock available for: " + item);
        return true;
    }
}

class Payment {
    public void pay(double amount) {
        System.out.println("Payment of Rs " + amount + " done");
    }
}

class Delivery {
    public void ship(String address) {
        System.out.println("Order shipped to: " + address);
    }
}

class OrderFacade {
    private Inventory inventory = new Inventory();
    private Payment payment = new Payment();
    private Delivery delivery = new Delivery();

    public void placeOrder(String item, double amount, String address) {
        if (inventory.checkStock(item)) {
            payment.pay(amount);
            delivery.ship(address);
            System.out.println("Order placed successfully!");
        } else {
            System.out.println("Order could not be placed: item is out of stock");
        }
    }
}

public class lab9_5 {
    public static void main(String[] args) {
        OrderFacade order = new OrderFacade();
        order.placeOrder("Headphones", 1499.0, "Gandhinagar");
    }
}
