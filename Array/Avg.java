import java.util.*;

public class Avg {

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

    public static double soln3(int[] arr) {
        int maxi = soln1(arr);
        int mini = soln2(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != maxi || arr[i] != mini) {
                sum += arr[i];
            }
        }
        return sum / (arr.length - 2);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("Ans: " + soln3(arr));
    }
}
