import java.util.*;

public class q15 {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 0, 3, 0, 5, 0, 6 };
        int cnt0 = 0, ncnt = 0;
        for (int num : arr) {
            if (num == 0) {
                cnt0++;
            }
        }
        int[] a = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                a[j++] = arr[i];
            }
        }
        for (int i = j; i < arr.length; i++) {
            a[j++] = 0;
        }
        System.out.println(Arrays.toString(a));
    }
}
