import java.util.Arrays;

public class CountingSortStudentAges {

    static void countingSort(int[] ages) {
        int minAge = 10;
        int maxAge = 18;

        int[] count = new int[maxAge - minAge + 1];
        int[] output = new int[ages.length];

        for (int age : ages) {
            count[age - minAge]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = ages.length - 1; i >= 0; i--) {
            output[count[ages[i] - minAge] - 1] = ages[i];
            count[ages[i] - minAge]--;
        }

        for (int i = 0; i < ages.length; i++) {
            ages[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] ages = {15, 12, 18, 10, 14, 16, 12, 11};

        countingSort(ages);

        System.out.println("Sorted Student Ages: " + Arrays.toString(ages));
    }
}