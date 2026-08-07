package ProblemSolving.Level2;
import java.util.Scanner;
public class PowerCalculation {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base : ");
        double base = sc.nextDouble();
        System.out.print("Enter the Exponent : ");
        double exponent = sc.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println(result);
    }
}
