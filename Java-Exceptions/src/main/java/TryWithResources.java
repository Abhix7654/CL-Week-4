import java.io.*;

public class TryWithResources {

    public static String readFirstLine(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            return br.readLine();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
        return null;
    }

    public static void main(String[] args) {
        String fileName = "examplefile.txt";
        String firstLine = readFirstLine(fileName);

        if (firstLine != null) {
            System.out.println("First line: " + firstLine);
        } else {
            System.out.println("Could not read the file.");
        }
    }
}
