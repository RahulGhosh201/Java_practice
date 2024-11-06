import java.util.*;

public class q12 {

    public static void soln(int[] a, int key) {
        // for (int i = 0; i < a.length; i++) {
        // for (int j = i + 1; j < a.length; j++) {
        // if (a[i] + a[j] == key) {
        // System.out.println(a[i] + ", " + a[j]);
        // }
        // }
        // }
        HashSet<Integer> set = new HashSet<>();
        boolean found = false;
        for (int num : a) {
            int complement = key - num;
            if (set.contains(complement)) {
                System.out.println(num + ", " + complement);
            }
            set.add(num);
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, -5, 6, 7, 8, 9 };
        int key = 3;
        soln(a, key);
    }
}