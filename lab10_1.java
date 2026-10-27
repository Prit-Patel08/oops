import java.util.ArrayList;
import java.util.List;

interface Subscriber {
    void update(String videoTitle);
}

class User implements Subscriber {
    private String name;

    public User(String name) { this.name = name; }

    public void update(String videoTitle) {
        System.out.println(name + " got notification: " + videoTitle);
    }

    public String getName() { return name; }
}

class Channel {
    private String name;
    private List<Subscriber> subscribers = new ArrayList<>();

    public Channel(String name) { this.name = name; }

    public void subscribe(Subscriber subscriber) {
        if (!subscribers.contains(subscriber)) subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        if (subscribers.remove(subscriber) && subscriber instanceof User) {
            // The lab's expected output names the unsubscribed user.
            System.out.println(((User) subscriber).getName() + " unsubscribed");
        }
    }

    public void uploadVideo(String title) {
        System.out.println(name + " uploaded: " + title);
        for (Subscriber subscriber : subscribers) subscriber.update(title);
    }
}

public class lab10_1 {
    public static void main(String[] args) {
        Channel channel = new Channel("CodeWithPDEU");
        User asha = new User("Asha");
        User ravi = new User("Ravi");

        channel.subscribe(asha);
        channel.subscribe(ravi);
        channel.uploadVideo("Java Design Patterns");
        channel.unsubscribe(ravi);
        channel.uploadVideo("Observer Pattern");
    }
}
