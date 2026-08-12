class Distance {
    int feet;
    int inch;
    Distance(int feet) {
        this.feet = feet;
        this.inch = 5;
    }
    Distance() {
        this(5);   
    }
    Distance(Distance d) {
        this.feet = d.feet;
        this.inch = d.inch;
    }
    void display() {
        System.out.println(feet + " feet " + inch + " inches");
    }
    public static void main(String[] args) {
        Distance d1 = new Distance();       
        Distance d2 = new Distance(10);     
        Distance d3 = new Distance(d2);     

        d1.display();
        d2.display();
        d3.display();
    }
}
