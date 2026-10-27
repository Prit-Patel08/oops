class Burger {
    private String type;
    private boolean cheese;
    private boolean extraPatty;
    private boolean fries;

    private Burger(Builder builder) {
        this.type = builder.type;
        this.cheese = builder.cheese;
        this.extraPatty = builder.extraPatty;
        this.fries = builder.fries;
    }

    public double getPrice() {
        double price = 120.0;
        if (cheese) price += 20.0;
        if (extraPatty) price += 50.0;
        if (fries) price += 60.0;
        return price;
    }

    public String toString() {
        StringBuilder result = new StringBuilder(type);
        if (cheese) result.append(" + Cheese");
        if (extraPatty) result.append(" + Extra Patty");
        if (fries) result.append(" + Fries");
        result.append("\nTotal: Rs ").append(getPrice());
        return result.toString();
    }

    static class Builder {
        private String type;
        private boolean cheese;
        private boolean extraPatty;
        private boolean fries;

        public Builder(String type) {
            if (type == null || type.trim().isEmpty()) {
                throw new IllegalArgumentException("Burger type is required");
            }
            this.type = type;
        }

        public Builder addCheese() { cheese = true; return this; }
        public Builder addExtraPatty() { extraPatty = true; return this; }
        public Builder addFries() { fries = true; return this; }
        public Burger build() { return new Burger(this); }
    }
}

public class lab8_5 {
    public static void main(String[] args) {
        Burger b = new Burger.Builder("Veg Burger")
                .addCheese()
                .addFries()
                .build();
        System.out.println(b);
    }
}
