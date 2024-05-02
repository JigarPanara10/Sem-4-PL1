import java.util.Scanner;
import java.util.InputMismatchException;

public class P16 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();

                while (true) {
                    System.out.print("Enter the second number: ");
                    double num2 = scanner.nextDouble();

                    try {
                        double result = num1 / num2;
                        System.out.println("The result is: " + result);
                        break;
                    } catch (ArithmeticException e) {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                }

                break;
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
