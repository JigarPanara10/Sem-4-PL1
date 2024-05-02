import java.io.*;

public class P4 {
    public static void main(String[] args) {
        try {
            // Create a new file
            File file = new File("myFile.txt");

            // Write content to the file
            FileWriter writer = new FileWriter(file);
            writer.write("Hello World");
            writer.close();

            System.out.println("Data has been written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
