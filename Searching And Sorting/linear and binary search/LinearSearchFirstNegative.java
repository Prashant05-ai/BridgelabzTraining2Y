public class LinearSearchFirstNegative {
    public static void main(String[] args) {
        int[] arr = {5, 8, 3, -2, -7, 10};
        int index = -1;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < 0) { index = i; break; }
        System.out.println("First negative index: " + index);
    }
}