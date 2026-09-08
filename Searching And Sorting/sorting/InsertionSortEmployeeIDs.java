import java.util.Arrays;

public class InsertionSortEmployeeIDs {
    public static void main(String[] args) {
        int[] employeeIDs = {105, 102, 108, 101, 110, 103};

        for (int i = 1; i < employeeIDs.length; i++) {
            int key = employeeIDs[i];
            int j = i - 1;

            while (j >= 0 && employeeIDs[j] > key) {
                employeeIDs[j + 1] = employeeIDs[j];
                j--;
            }

            employeeIDs[j + 1] = key;
        }

        System.out.println("Sorted Employee IDs: " + Arrays.toString(employeeIDs));
    }
}