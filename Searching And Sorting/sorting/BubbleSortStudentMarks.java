import java.util.Arrays;

public class BubbleSortStudentMarks {
    public static void main(String[] args) {
        int[] marks = {78, 45, 90, 32, 67, 85};

        for (int i = 0; i < marks.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < marks.length - 1 - i; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }

        System.out.println("Sorted Student Marks: " + Arrays.toString(marks));
    }
}