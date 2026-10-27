import java.util.ArrayList;
import java.util.List;

interface FoodItem {
    double getPrice();
}

class Item implements FoodItem {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() { return price; }
}

class Combo implements FoodItem {
    private String name;
    private List<FoodItem> items = new ArrayList<>();

    public Combo(String name) { this.name = name; }

    public void add(FoodItem item) { items.add(item); }

    public double getPrice() {
        double total = 0.0;
        for (FoodItem item : items) total += item.getPrice();
        return total;
    }
}

public class lab9_4 {
    public static void main(String[] args) {
        Combo kidsCombo = new Combo("Kids Combo");
        kidsCombo.add(new Item("Fries", 80));
        kidsCombo.add(new Item("Juice", 50));

        Combo familyCombo = new Combo("Family Combo");
        familyCombo.add(new Item("Pizza", 300));
        familyCombo.add(new Item("Coke", 60));
        familyCombo.add(kidsCombo);

        System.out.println("Kids Combo price: Rs " + kidsCombo.getPrice());
        System.out.println("Family Combo price: Rs " + familyCombo.getPrice());
    }
}
