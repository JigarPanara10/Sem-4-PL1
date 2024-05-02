import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class P12 {
    private static final int NUM_ELEMENTS = 1000000;
    private static List<Integer> list = new ArrayList<>();

    public static class LongRunningTask implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < NUM_ELEMENTS; i++) {
                list.add(i);
            }
            Collections.sort(list);
        }
    }

    public static class ProgressBar implements Runnable {
        private int total;
        private int completed;

        public ProgressBar(int total, int completed) {
            this.total = total;
            this.completed = completed;
        }

        @Override
        public void run() {
            int percentage = (completed * 100) / total;
            System.out.print("\rProgress: " + percentage + "%");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(new LongRunningTask());

        int total = NUM_ELEMENTS;
        int completed = 0;
        while (completed < total) {
            completed = list.size();
            executor.submit(new ProgressBar(total, completed));
        }

        executor.shutdown();
        while (!executor.isTerminated()) {
            // wait for the executor to finish
        }
        System.out.println("\nTask completed.");
    }
}
