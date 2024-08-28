import java.util.*;

public class MoveZero {

    public static void soln(int[] arr) {
        int nonZeroIndex = 0;
        for (int num : arr) {
            if (num != 0) {
                arr[nonZeroIndex++] = num;
            }
        }
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 5, 0, 6, 3, 4, 0 };
        System.out.println("Original array: " + Arrays.toString(arr));
        soln(arr);
        System.out.println("Modified array after moving the zeroes: " + Arrays.toString(arr));
    }
}
