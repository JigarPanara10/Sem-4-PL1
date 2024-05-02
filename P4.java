class DivisibleByThreeThread extends Thread {
    public void run() {
        System.out.println("Numbers divisible by 3:");
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Move to the next line after printing all numbers divisible by 3
    }
}

class DivisibleByFiveThread extends Thread {
    public void run() {
        System.out.println("Numbers divisible by 5:");
        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Move to the next line after printing all numbers divisible by 5
    }
}

public class P4	 {
    public static void main(String[] args) {
        DivisibleByThreeThread thread1 = new DivisibleByThreeThread();
        DivisibleByFiveThread thread2 = new DivisibleByFiveThread();

        thread1.start();
        thread2.start();
    }
}
