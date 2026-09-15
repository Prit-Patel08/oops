import java.util.Scanner;

public class lab5_p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 0, 40, 50};
        try {
            System.out.print("Enter i: ");
            int i = sc.nextInt();
            System.out.print("Enter j: ");
            int j = sc.nextInt();
            int result = arr[i] / arr[j];
            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Index must be between 0 and 4.");
        }
        sc.close();
    }
}
