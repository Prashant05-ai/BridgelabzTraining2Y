import java.io.*;
import java.util.Scanner;
public class FileReaderCountWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word to search: ");
        String target = sc.nextLine();
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words)
                    if (word.equalsIgnoreCase(target)) count++;
            }
            System.out.println("Occurrences: " + count);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}