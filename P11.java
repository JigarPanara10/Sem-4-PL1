class EvenThread extends Thread {
    public void run() {
        System.out.println("Even numbers:");
        for (int i = 0; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(); // Move to the next line after printing all even numbers
    }
}

class OddThread extends Thread {
    public void run() {
        System.out.println("Odd numbers:");
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(); // Move to the next line after printing all odd numbers
    }
}

public class P11 {
    public static void main(String[] args) {
        Thread evenThread = new EvenThread();
        Thread oddThread = new OddThread();

        evenThread.start();
        oddThread.start();
    }
}
