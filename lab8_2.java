interface Notification {
    void send(String to, String msg);
}

class EmailNotification implements Notification {
    public void send(String to, String msg) {
        System.out.println("Email sent to " + to + ": " + msg);
    }
}

class SmsNotification implements Notification {
    public void send(String to, String msg) {
        System.out.println("SMS sent to " + to + ": " + msg);
    }
}

class WhatsAppNotification implements Notification {
    public void send(String to, String msg) {
        System.out.println("WhatsApp sent to " + to + ": " + msg);
    }
}

class NotificationFactory {
    public Notification getNotification(String type) {
        if (type.equalsIgnoreCase("Email")) return new EmailNotification();
        if (type.equalsIgnoreCase("SMS")) return new SmsNotification();
        if (type.equalsIgnoreCase("WhatsApp")) return new WhatsAppNotification();
        throw new IllegalArgumentException("Invalid notification type: " + type);
    }
}

public class lab8_2 {
    public static void main(String[] args) {
        String message = "Your order has been shipped";
        NotificationFactory factory = new NotificationFactory();

        Notification sms = factory.getNotification("SMS");
        sms.send("9876543210", message);

        Notification email = factory.getNotification("Email");
        email.send("asha@gmail.com", message);
    }
}
