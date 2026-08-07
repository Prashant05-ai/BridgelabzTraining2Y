package ProblemSolving.Level2;
import java.util.Scanner;
public class KilometerstoMiles {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in km : ");
        double km = sc.nextDouble();
        double m = km* 0.621371;
        System.out.println("The miles are : "+m);
    }
}
