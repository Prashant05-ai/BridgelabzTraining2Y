import java.util.Scanner;

public class Q6_BMI {
    static String status(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal weight";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[] weight = new double[n], height = new double[n], bmi = new double[n];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
                weight[i] = sc.nextDouble();
            } while (weight[i] <= 0);
            do {
                System.out.print("Enter height (m) for person " + (i + 1) + ": ");
                height[i] = sc.nextDouble();
            } while (height[i] <= 0);
            bmi[i] = weight[i] / (height[i] * height[i]);
            weightStatus[i] = status(bmi[i]);
        }

        for (int i = 0; i < n; i++)
            System.out.printf("Person %d: Height = %.2f m, Weight = %.2f kg, BMI = %.2f, Status = %s%n", i + 1, height[i], weight[i], bmi[i], weightStatus[i]);
    }
}
