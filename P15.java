import java.util.InputMismatchException;
import java.util.Scanner;

public class P15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Scenario 1: Handle non-numeric input
        int dividend = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter the dividend: ");
                dividend = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid integer.");
                scanner.nextLine(); // Clear the input buffer
            }
        }
        
        // Scenario 2: Handle division by zero
        int divisor = 0;
        validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter the divisor: ");
                divisor = scanner.nextInt();
                if (divisor == 0) {
                    throw new ArithmeticException("Error: Division by zero.");
                }
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid integer.");
                scanner.nextLine(); // Clear the input buffer
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
        
        // Perform the division
        double result = (double) dividend / divisor;
        System.out.println("Result: " + result);

        scanner.close();
    }
}
