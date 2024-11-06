import java.util.*;

public class q14 {
    public static int soln(int[] arr) {
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        int sumOfElements = 0, temp = 0;
        for (int i = 0; i < arr.length; i++) {
            mini = Math.min(mini, arr[i]);
            maxi = Math.max(maxi, arr[i]);
            sumOfElements += arr[i];
        }

        for (int i = mini; i <= maxi; i++) {
            temp += i;
        }
        return (temp - sumOfElements);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6, 7 };
        int ans = soln(arr);
        System.out.println(ans);
    }
}
