import java.util.*;

class UserInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter your favorite color: ");
        String favoriteColor = scanner.nextLine();

        String formattedMessage = String.format("Your information:\n\nName: %s,\nAge: %d,\nFavorite Color: %s.", name, age, favoriteColor);
        System.out.println(formattedMessage);
    }
}