import java.util.*;

public class q10 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int maxi1 = Integer.MIN_VALUE, maxi2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxi1 = Math.max(maxi1, arr[i]);
            min1 = Math.min(min1, arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxi2 && arr[i] < maxi1) {
                maxi2 = arr[i];
            }
            if (min2 > arr[i] && arr[i] > min1) {
                min2 = arr[i];
            }
        }
        System.out.println("Second largest: " + maxi2 + " Second smallest: " + min2);
    }
}
