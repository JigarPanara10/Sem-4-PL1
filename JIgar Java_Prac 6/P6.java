import java.io.*;

public class P6 {
    public static void main(String[] args) {
        try {
            // Open the file for appending
            File file = new File("myFile.txt");
            FileWriter writer = new FileWriter(file, true);

            // Append the new line to the file
            writer.write("\nJava Programming is awesome");
            writer.close();

            System.out.println("Data has been appended to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }
    }
}
