import java.util.*;

public class DiffMaxMin {

    public static int soln1(int[] arr) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        return ans;
    }

    public static int soln2(int[] arr) {
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int maxi = soln1(arr);
        int mini = soln2(arr);
        System.out.println("Difference between maximum and minimum elements in the array: " + (maxi - mini));
    }
}
