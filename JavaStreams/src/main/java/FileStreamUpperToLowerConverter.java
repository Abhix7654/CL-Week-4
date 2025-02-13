import java.io.*;
public class FileStreamUpperToLowerConverter {
    public static void convertToLowercase(String inputFile, String outputFile) {
            try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

                String line;
                while ((line = reader.readLine()) != null) {
                    writer.write(line.toLowerCase());
                    writer.newLine();
                }
                System.out.println("File successfully converted to lowercase and written to " + outputFile);
            } catch (IOException e) {
                System.err.println("Error processing file: " + e.getMessage());
            }
        }

        public static void main(String[] args) {
            String inputFile = "examplefile.txt";
            String outputFile = "Output.txt";

            convertToLowercase(inputFile, outputFile);
        }
    }
