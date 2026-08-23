import java.util.Scanner;

public class Q8_StudentMarks {
    static String grade(double p) {
        if (p >= 90) return "A";
        if (p >= 80) return "B";
        if (p >= 70) return "C";
        if (p >= 60) return "D";
        return "F";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.print("Enter " + (j == 0 ? "Physics" : j == 1 ? "Chemistry" : "Maths") + " marks: ");
                    marks[i][j] = sc.nextInt();
                } while (marks[i][j] < 0 || marks[i][j] > 100);
            }
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            grades[i] = grade(percentage[i]);
        }

        for (int i = 0; i < n; i++)
            System.out.printf("Student %d: Physics=%d, Chemistry=%d, Maths=%d, Percentage=%.2f%%, Grade=%s%n", i + 1, marks[i][0], marks[i][1], marks[i][2], percentage[i], grades[i]);
    }
}
