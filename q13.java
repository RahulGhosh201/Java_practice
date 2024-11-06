import java.util.*;

public class q13 {

    public static boolean soln(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 5, 4, 3, 1, 2 };
        if (soln(a, b)) {
            System.out.println("Equal arrays");
        } else {
            System.out.println("Not equal arrays");
        }
    }
}
