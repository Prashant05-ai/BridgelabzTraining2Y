import java.util.Scanner;
public class StringBuilderReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Reversed String: " + new StringBuilder(s).reverse());
        sc.close();
    }
}