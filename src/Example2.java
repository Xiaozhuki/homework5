import java.io.*;

public class Example2 {
    public static void main(String[] args) {
        File file = new File("example.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("This is a test file.");
            writer.newLine();
            writer.write("Learning java.io package.");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}