class Distance {
    int feet;
    int inches;
    public void setFeet(int feet) {
        this.feet = feet;
    }
    public void setInches(int inches) {
        this.inches = inches;
    }
    public int getFeet() {
        return this.feet;
    }
    public int getInches() {
        return this.inches;
    }
    @Override
    public String toString() {
        return "Distance = " + feet + " feet " + inches + " inches";
    }
}

public class lab1_3 {
    public static void main(String[] args) {
        Distance d = new Distance();
        d.setFeet(5);
        d.setInches(8);
        System.out.println("Feet: " + d.getFeet());
        System.out.println("Inches: " + d.getInches());
        System.out.println(d.toString());
    }
}
