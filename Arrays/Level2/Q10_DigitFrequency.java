import java.util.Scanner;

public class Q10_DigitFrequency {
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

        int[] frequency = new int[10];
        for (int digit : digits) frequency[digit]++;

        for (int i = 0; i < 10; i++)
            System.out.println("Digit " + i + " = " + frequency[i]);
    }
}
