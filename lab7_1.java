class EvenThread extends Thread {
    public void run() {
        System.out.println("Even Numbers: ");
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}

class OddThread extends Thread {
    public void run() {
        System.out.println("Odd Numbers: ");
        for (int i = 1; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}

public class lab7_1 {
    public static void main(String[] args) {
        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();

        even.start();
        odd.start();
    }
}
