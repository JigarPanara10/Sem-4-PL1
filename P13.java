import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class P12 {
    private static final int MAX_BUFFER_SIZE = 10;
    private static BlockingQueue<Double> buffer = new LinkedBlockingQueue<>(MAX_BUFFER_SIZE);
    private static Random random = new Random();

    public static class Producer implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    double randomNumber = random.nextDouble() * 100;
                    System.out.println("Producer: Produced " + randomNumber);
                    buffer.put(randomNumber);
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class Consumer implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    double number = buffer.take();
                    double squareRoot = Math.sqrt(number);
                    System.out.println("Consumer: Square root of " + number + " is " + squareRoot);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread producerThread = new Thread(new Producer());
        Thread consumerThread = new Thread(new Consumer());

        producerThread.start();
        consumerThread.start();
    }
}
