import java.util.*;

public class q8 {

    public static int soln2(int[] a, int[] b) {
        int ans = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    ans = a[i];
                }
            }
        }
        return ans;
    }

    public static String soln1(String[] c, String[] d) {
        String ans = "";
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < d.length; j++) {
                if (c[i].equals(d[j])) {
                    ans = c[i];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        int[] b = { 5, 3, 6, 7 };
        String[] c = { "aba", "bcb", "ded" };
        String[] d = { "fef", "ded" };
        String commonStr = soln1(c, d);
        System.out.println("Common string element: " + commonStr);
        int commonInt = soln2(a, b);
        System.out.println("Common int: " + commonInt);
    }
}