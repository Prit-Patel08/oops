class Vehicle {

    private int NoOfTyres;
    private String EngineNo;
    private String Body_Colour;
    private String rto_name;

    static int count = 0;

    Vehicle(int NoOfTyres, String EngineNo, String Body_Colour) {
        this.NoOfTyres = NoOfTyres;
        this.EngineNo = EngineNo;
        this.Body_Colour = Body_Colour;
    }
    {
        rto_name = "Ahmedabad";
        count++;
        System.out.println("Till now the objects created are " + (count));
    }
    public void setrto_name(String rto_name) {
        this.rto_name = rto_name;
    }
    public String getrto_name() {
        return rto_name;
    }
    @Override
    public String toString() {
        return "Number of Tyres = " + NoOfTyres + ", Engine No = " + EngineNo + ", Body Color = " + Body_Colour + ", RTO Name = " + rto_name + ", Total Objects = " + count;
    }
}

public class lab2_p2 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(4, "EN101", "Red");
        Vehicle v2 = new Vehicle(4, "EN102", "Blue");
        Vehicle v3 = new Vehicle(2, "EN103", "Black");

        v1.setrto_name("Mumbai");
        v2.setrto_name("Delhi");

        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println(v3.toString());
    }
}
