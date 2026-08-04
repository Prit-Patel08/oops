import java.util.Scanner;

public class CapitalWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String str = sc.nextLine();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((i == 0 || str.charAt(i - 1) == ' ') &&
                str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                count++;
            }
        }
        System.out.println("Number of words starting with capital letters = " + count);
        sc.close();
    }
}
