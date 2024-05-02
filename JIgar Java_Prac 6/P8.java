import java.io.*;

public class P8 {
    public static void main(String[] args) {
        try {
            // Create a new file
            File file = new File("myData.csv");

            // Write the data to the file
            FileWriter writer = new FileWriter(file);
            writer.write("Name, Age, Gender\n");
            writer.write("John Doe, 25, Male\n");
            writer.write("John Smith, 30, Female\n");
            writer.write("David Lee, 20, Male\n");
            writer.close();

            System.out.println("Data has been written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
