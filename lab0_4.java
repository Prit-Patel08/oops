import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double s1, s2, s3, s4, s5, s6;

        System.out.print("Enter marks of 6 subjects: ");
        s1 = sc.nextDouble();
        s2 = sc.nextDouble();
        s3 = sc.nextDouble();
        s4 = sc.nextDouble();
        s5 = sc.nextDouble();
        s6 = sc.nextDouble();

        double total = s1 + s2 + s3 + s4 + s5 + s6;
        double percentage = (total / 600) * 100;

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");

        sc.close();
    }
}
