class EvenThread extends Thread {
    public void run() {
        for(int i = 1; i <= 20; i++){
            if (i % 2 == 0) {
                System.out.println("Even: "+i);
            }
        }
    }
}
class OddThread extends Thread {
    public void run() {
        for(int i = 1; i <= 20; i++){
            if (i % 2 != 0) {
                System.out.println("Odd: "+i);
            }
        }
    }
}
public class lab7_2 {
    public static void main(String[] args) {
        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();

        even.setPriority(Thread.MAX_PRIORITY); 
        odd.setPriority(Thread.MIN_PRIORITY);  

        even.start();
        odd.start();
    }
}
