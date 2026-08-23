import java.util.Scanner;

public class Q3_LargestSecondLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = Math.abs(sc.nextLong());
        int[] digits = new int[10];
        int index = 0;

        if (number == 0) digits[index++] = 0;
        while (number != 0 && index < digits.length) {
            digits[index++] = (int)(number % 10);
            number /= 10;
        }

        int largest = -1, second = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                second = largest;
                largest = digits[i];
            } else if (digits[i] > second && digits[i] != largest) {
                second = digits[i];
            }
        }
        System.out.println("Largest digit = " + largest);
        System.out.println("Second largest distinct digit = " + (second == -1 ? "Does not exist" : second));
    }
}
