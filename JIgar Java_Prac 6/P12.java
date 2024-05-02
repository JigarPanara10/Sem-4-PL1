import java.io.*;

public class P12 {
    public static void main(String[] args) {
        try {
            File file = new File("myData.csv");

            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while deleting the file.");
            e.printStackTrace();
        }
    }
}
