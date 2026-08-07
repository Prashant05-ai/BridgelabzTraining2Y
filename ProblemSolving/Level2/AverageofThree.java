package ProblemSolving.Level2;
import java.util.Scanner;
public class AverageofThree {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        System.out.print("Enter the third number : ");
        int c = sc.nextInt();
        int avg = (a+b+c)/3;
        System.out.println("The average of three number is : "+avg);
    }
}
