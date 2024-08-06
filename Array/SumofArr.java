import java.util.*;

public class SumofArr {
    public static int sum(int[] arr) {
        int ans = 0;
        for (int i : arr) {
            ans += i;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Sum of the array: " + sum(arr));
    }
}