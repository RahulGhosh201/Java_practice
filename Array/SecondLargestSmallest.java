import java.util.*;

public class SecondLargestSmallest {

    public static int soln1(int[] arr) {
        int max = Integer.MIN_VALUE, ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans && arr[i] != max) {
                ans = arr[i];
            }
        }
        return ans;
    }

    public static int soln2(int[] arr) {
        int min = Integer.MAX_VALUE, ans = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans && arr[i] != min) {
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 3, 6, 4, 7 };
        int a = soln1(arr);
        int b = soln2(arr);
        System.out.println("Second largest element in the array: " + a);
        System.out.println("Second smallest element in the array: " + b);

    }
}
