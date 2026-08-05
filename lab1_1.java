import java.util.Scanner;

public class lab1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 7 days temperature: ");
        float[] array = new float[7];
        float total = 0;
        float mx = -1 * 1000000, mn = 1000000;
        for (int i = 0; i < 7; i++) {
            array[i] = sc.nextFloat();
            total += array[i];
            if (array[i] > mx) mx = array[i];
            if (array[i] < mn) mn = array[i];
        } 
        float average = total / 7;
        int greater_than_average = 0;
        for (int i = 0; i < 7; i++) {
            if (array[i] > average) greater_than_average++;
        }
        System.out.println("Average: " + average);
        System.out.println("Maximum Temperature: " + mx);
        System.out.println("Minimum: " + mn);
        System.out.println("No of days where temperature is higher than average: " + greater_than_average);
    }
}
