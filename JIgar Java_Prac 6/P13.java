import java.io.*;

public class P13{
    public static void main(String[] args) {
        try {
            // Create a new directory
            File directory = new File("myDirectory");
            if (!directory.exists()) {
                if (directory.mkdir()) {
                    System.out.println("Directory created: " + directory.getName());
                } else {
                    System.out.println("Failed to create the directory.");
                    return;
                }
            }

            // Move the file to the directory
            File file = new File("myFile.txt");
            File newFile = new File(directory.getPath() + File.separator + file.getName());
            if (file.renameTo(newFile)) {
                System.out.println("File moved to the directory successfully.");
            } else {
                System.out.println("Failed to move the file to the directory.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while moving the file to the directory.");
            e.printStackTrace();
        }
    }
}
