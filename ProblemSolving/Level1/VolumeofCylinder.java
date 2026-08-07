package ProblemSolving.Level1;
import java.util.Scanner;
public class VolumeofCylinder {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        double r = sc.nextDouble();
        System.out.print("Enter the height : ");
        double h = sc.nextDouble();
        double v= 3.14*r*r*h;
        System.out.println("Volume of the cylinder is : "+v);
    }
}
