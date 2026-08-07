package ProblemSolving.Level1;
import java.util.Scanner;
public class AreaofCircle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the  radius : ");
        double radius = sc.nextInt();
        double Area = 3.14 * radius*radius;
        System.out.println("Area of the circle is : "+Area);

    }
}
