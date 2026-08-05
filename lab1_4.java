import java.util.Scanner;

class Area {
        void findArea(double side) {
            System.out.println("Area of square: " + (side * side));
        }
        void findArea(double length, double breadth) {
            System.out.println("Area of rectangle: " + (length * breadth));
        }
    }

public class lab1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area a = new Area();

        System.out.print("Enter side length of square: ");
        double side = sc.nextDouble();
        a.findArea(side);

        System.out.print("Enter length and breadth of rectengle: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        a.findArea(length,breadth);
    }
}
