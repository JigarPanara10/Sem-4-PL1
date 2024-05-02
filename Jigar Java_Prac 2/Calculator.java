public class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two integers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two integers
    // Note: This method does not handle division by zero.
    public int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Test the methods
        int sum = calculator.add(5, 3);
        System.out.println("Sum: " + sum);

        int difference = calculator.subtract(8, 3);
        System.out.println("Difference: " + difference);

        int product = calculator.multiply(4, 5);
        System.out.println("Product: " + product);

        int quotient = calculator.divide(10, 2);
        System.out.println("Quotient: " + quotient);
    }
}
