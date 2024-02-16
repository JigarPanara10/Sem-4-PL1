import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {

	system.out.println("Name :: Jigar Panara ");
	system.out.println("Enrollment Number :: 220130318017");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number or string: ");
        String input = scanner.nextLine();

        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        scanner.close();
    }
}