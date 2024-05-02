// Custom exception class for DivideByZeroException
class DivideByZeroException extends Exception {
    public DivideByZeroException(String message) {
        super(message);
    }
}

public class P3 {
    public static void divide(int dividend, int divisor) throws DivideByZeroException {
        if (divisor == 0) {
            throw new DivideByZeroException("Error: Divide by Zero");
        }
        int result = dividend / divisor;
        System.out.println("Result of division: " + result);
    }

    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;

        try {
            divide(dividend, divisor);
        } catch (DivideByZeroException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
