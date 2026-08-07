package ProblemSolving.Level1;
import java.util.Scanner;
public class Addition {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The addition of two number is : "+sum);
    }
}
