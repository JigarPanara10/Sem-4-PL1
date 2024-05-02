import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers (enter any non-numeric value to stop):");

        while (true) {
            try {
                int num = scanner.nextInt();
                System.out.println("You entered: " + num);
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Input is not an integer. Exiting.");
                break; // Exit the loop if non-numeric input is encountered
            }
        }

        scanner.close();
    }
}
