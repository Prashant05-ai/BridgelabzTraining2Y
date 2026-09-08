import java.util.Arrays;

public class SelectionSortExamScores {
    public static void main(String[] args) {
        int[] scores = {75, 90, 60, 85, 70, 95};

        for (int i = 0; i < scores.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = scores[i];
            scores[i] = scores[minIndex];
            scores[minIndex] = temp;
        }

        System.out.println("Sorted Exam Scores: " + Arrays.toString(scores));
    }
}