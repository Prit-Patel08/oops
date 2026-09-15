import java.util.Scanner;

public class lab5_p2 {
    static void checkNumber(int num) {
        if (num % 2 != 0) {
            throw new NumberFormatException("Number is odd");
        }
        System.out.println("Number is even: " + num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        try {
            checkNumber(num);
        } catch (NumberFormatException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        sc.close();
    }
}
