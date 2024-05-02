public class P8 {
    public static void main(String[] args) {
        int num = 10;
        int denom = 0;

        try {
            if (denom == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            int result = num / denom;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
