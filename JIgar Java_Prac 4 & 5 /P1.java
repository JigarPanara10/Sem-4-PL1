public class P1 {
    private static int commonVariable = 0;

    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                incrementCommonVariable();
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final value of commonVariable: " + commonVariable);
    }

    private synchronized static void incrementCommonVariable() {
        commonVariable++;
    }
}
