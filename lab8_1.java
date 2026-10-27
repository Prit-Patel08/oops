import java.util.Scanner;

interface Ride {
    double fare(int km);
}

class Bike implements Ride {
    public double fare(int km) { return km * 8.0; }
}

class Auto implements Ride {
    public double fare(int km) { return km * 12.0; }
}

class Car implements Ride {
    public double fare(int km) { return km * 18.0; }
}

class RideFactory {
    public Ride getRide(String type) {
        if (type.equalsIgnoreCase("Bike")) return new Bike();
        if (type.equalsIgnoreCase("Auto")) return new Auto();
        if (type.equalsIgnoreCase("Car")) return new Car();
        throw new IllegalArgumentException("Invalid ride type: " + type);
    }
}

public class lab8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ride type: ");
        String type = sc.nextLine().trim();
        System.out.print("Enter distance (km): ");
        int km = sc.nextInt();

        Ride ride = new RideFactory().getRide(type);
        String rideName = type.substring(0, 1).toUpperCase() + type.substring(1).toLowerCase();
        System.out.println("Ride: " + rideName);
        System.out.println("Fare: Rs " + ride.fare(km));
        sc.close();
    }
}
