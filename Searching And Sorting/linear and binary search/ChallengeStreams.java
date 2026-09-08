import java.io.*;
public class ChallengeStreams {
    static long countWordsFileReader(String file) throws IOException {
        long count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null)
                count += line.trim().isEmpty() ? 0 : line.trim().split("\\s+").length;
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        int n = 1000000;
        long start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++) sb.append("hello");
        System.out.println("StringBuilder: " + (System.nanoTime()-start) + " ns");

        start = System.nanoTime();
        StringBuffer sf = new StringBuffer();
        for(int i=0;i<n;i++) sf.append("hello");
        System.out.println("StringBuffer: " + (System.nanoTime()-start) + " ns");

        System.out.println("Words in input.txt: " + countWordsFileReader("input.txt"));
    }
}