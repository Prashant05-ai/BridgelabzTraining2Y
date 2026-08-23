import java.util.Scanner;

public class Q5_ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = Math.abs(sc.nextLong());
        long temp = number;
        int count = number == 0 ? 1 : 0;
        while (temp != 0) { count++; temp /= 10; }

        int[] digits = new int[count];
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = (int)(temp % 10);
            temp /= 10;
        }

        int[] reverse = new int[count];
        for (int i = 0; i < count; i++) reverse[i] = digits[count - 1 - i];

        System.out.print("Reversed number = ");
        for (int digit : reverse) System.out.print(digit);
        System.out.println();
    }
}
