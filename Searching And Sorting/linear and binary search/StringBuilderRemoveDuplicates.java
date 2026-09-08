import java.util.*;
public class StringBuilderRemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (!set.contains(ch)) {
                set.add(ch);
                result.append(ch);
            }
        }
        System.out.println("Without duplicates: " + result);
        sc.close();
    }
}