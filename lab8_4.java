interface MainCourse {
    void serve();
}

interface Dessert {
    void serve();
}

class PaneerButterMasala implements MainCourse {
    public void serve() { System.out.println("Serving main course: Paneer Butter Masala"); }
}

class GulabJamun implements Dessert {
    public void serve() { System.out.println("Serving dessert: Gulab Jamun"); }
}

class PastaAlfredo implements MainCourse {
    public void serve() { System.out.println("Serving main course: Pasta Alfredo"); }
}

class Tiramisu implements Dessert {
    public void serve() { System.out.println("Serving dessert: Tiramisu"); }
}

interface KitchenFactory {
    MainCourse createMainCourse();
    Dessert createDessert();
}

class IndianKitchen implements KitchenFactory {
    public MainCourse createMainCourse() { return new PaneerButterMasala(); }
    public Dessert createDessert() { return new GulabJamun(); }
}

class ItalianKitchen implements KitchenFactory {
    public MainCourse createMainCourse() { return new PastaAlfredo(); }
    public Dessert createDessert() { return new Tiramisu(); }
}

public class lab8_4 {
    public static void main(String[] args) {
        KitchenFactory kitchen = new ItalianKitchen();
        System.out.println("Order from: Italian kitchen");
        MainCourse mainCourse = kitchen.createMainCourse();
        Dessert dessert = kitchen.createDessert();
        mainCourse.serve();
        dessert.serve();
    }
}
