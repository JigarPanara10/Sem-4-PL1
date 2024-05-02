import java.io.*;

public class P10 {
    public static void main(String[] args) {
        try {
            // Open the file for reading
            File file = new File("myData.csv");
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);

            // Read the content of the file
            String line;
            String[] lines = new String[0];
            while ((line = bufferedReader.readLine()) != null) {
                lines = addLine(lines, line);
            }
            bufferedReader.close();

            // Write the updated content back to the file
            FileWriter writer = new FileWriter(file);
            for (String lineToUpdate : lines) {
                writer.write(lineToUpdate + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading from or writing to the file.");
            e.printStackTrace();
        }
    }

    private static String[] addLine(String[] lines, String line) {
        String[] updatedLines = new String[lines.length + 1];
        System.arraycopy(lines, 0, updatedLines, 0, lines.length);
        updatedLines[lines.length] = line.replace("20, Male", "21, Male");
        return updatedLines;
    }
}
