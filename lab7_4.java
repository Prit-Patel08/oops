
class SharedStack {
    private int[] stack;
    private int top;
    private int capacity;

    public SharedStack(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }
    public synchronized void push(int value)
            throws InterruptedException {
        while (top == capacity - 1) {
            wait();
        }
        stack[++top] = value;
        System.out.println("Produced: " + value);
        notifyAll();
    }
    public synchronized int pop()
            throws InterruptedException {
        while (top == -1) {
            wait();
        }
        int value = stack[top--];
        System.out.println("Consumed: " + value);
        notifyAll();

        return value;
    }
}
class Producer extends Thread {
    private SharedStack stack;
    public Producer(SharedStack stack) {
        this.stack = stack;
    }
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                stack.push(i);
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
class Consumer extends Thread {
    private SharedStack stack;
    public Consumer(SharedStack stack) {
        this.stack = stack;
    }
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                stack.pop();
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args)
            throws InterruptedException {
        SharedStack stack = new SharedStack(5);
        Producer producer = new Producer(stack);
        Consumer consumer = new Consumer(stack);
        producer.start();
        consumer.start();
        producer.join();
        consumer.join();
        System.out.println("Producer-Consumer completed.");
    }
}
