import java.io.*;
public class InputStreamReaderWriteToFile {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter("output.txt")) {
            System.out.println("Enter text (type exit to stop):");
            String input;
            while (!(input = br.readLine()).equalsIgnoreCase("exit")) {
                fw.write(input + System.lineSeparator());
            }
            System.out.println("Data saved to output.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}