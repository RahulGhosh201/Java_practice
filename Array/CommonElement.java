import java.util.*;

public class CommonElement {
    public static void soln(int[] a, int[] b, int[] c) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    list.add(a[i]);
                }
            }
        }
        System.out.println("Common elements are: ");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (c[i] == list.get(j)) {
                    System.out.println(c[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 };
        int[] b = { 2, 3, 7, 8, 9, 10 };
        int[] c = { 1, 2, 3, 4, 5, 10 };
        soln(a, b, c);

    }
}