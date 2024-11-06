import java.util.*;

public class q16 {

    public static int soln(int[] arr) {
        int ans = 1;
        Arrays.sort(arr);

        // for (int i = 0; i < arr.length - 1; i++) {
        // if (arr[i] + 1 == arr[i + 1]) {
        // ans++;
        // }
        // }this solution will work if there is no duplicate element in the array

        int currentStreak = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                currentStreak++;
            } else if (arr[i] != arr[i - 1]) {
                ans = Math.max(ans, currentStreak);
                currentStreak = 1;
            }
        }
        ans = Math.max(ans, currentStreak);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 49, 1, 3, 200, 2, 4, 70, 5, 6, 10, 7, 2, 1 };
        int ans = soln(arr);
        System.out.println(ans);
    }
}
