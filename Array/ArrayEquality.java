import java.util.*;

public class ArrayEquality {

    public static boolean soln(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        int i = 0, j = 0;
        while (i != a.length) {
            if (a[i] != b[i]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 1, 2, 3, 4, 5 };
        if (soln(a, b)) {
            System.out.println("Those arrays are equal");
        } else {
            System.out.println("Those arrays are not equal");
        }

    }
}