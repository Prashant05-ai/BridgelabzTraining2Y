package ProblemSolving.Level1;
import java.util.Scanner;
public class CelsiustoFahrenheit {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the temprature : ");
        int Celsius = sc.nextInt();
        int Fahrenheit = (Celsius * 9/5) + 32;
        System.out.println("After conversion is : "+Fahrenheit);
    }
}
