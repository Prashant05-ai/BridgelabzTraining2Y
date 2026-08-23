import java.util.Scanner;

public class Q1_EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        int i = 0;
        while (i < 10) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            double s = sc.nextDouble();
            System.out.print("Enter years of service: ");
            double y = sc.nextDouble();
            if (s <= 0 || y < 0) {
                System.out.println("Invalid input. Enter again.");
                continue;
            }
            salary[i] = s;
            years[i] = y;
            i++;
        }

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;
        for (i = 0; i < 10; i++) {
            bonus[i] = years[i] > 5 ? salary[i] * 0.05 : salary[i] * 0.02;
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nEmployee Details");
        for (i = 0; i < 10; i++)
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f%n", i + 1, salary[i], bonus[i], newSalary[i]);
        System.out.printf("Total Old Salary = %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus = %.2f%n", totalBonus);
        System.out.printf("Total New Salary = %.2f%n", totalNewSalary);
    }
}
