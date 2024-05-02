import java.io.*;
import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        try {
            // Create a new file
            File file = new File("example.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Write content to the file
            FileWriter writer = new FileWriter(file);
            writer.write("This is some sample text.");
            writer.write("\nThis is another line of text.");
            writer.close();

            System.out.println("File write operation completed.");

            // Read the content of the file
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();

            System.out.println("File read operation completed.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
