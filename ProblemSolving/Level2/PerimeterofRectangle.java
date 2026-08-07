package ProblemSolving.Level2;
import java.util.Scanner;
public class PerimeterofRectangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth : ");
        int b= sc.nextInt();
        int p = 2*(l+b);
        System.out.println("Perimeter of Rectangle : "+p);
    }
}
