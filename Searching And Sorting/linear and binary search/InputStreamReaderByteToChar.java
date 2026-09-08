import java.io.*;
import java.nio.charset.StandardCharsets;
public class InputStreamReaderByteToChar {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream("input.txt"), StandardCharsets.UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) System.out.println(line);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}