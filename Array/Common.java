import java.util.*;

public class Common {
    public static int commonInt(int[] a, int[] b) {
        int ans = -1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    ans = a[i];
                    break;
                }
            }
        }
        return ans;87y
    }

    public static void commonStr(String[] a, String[] b) {
        Set<String> set = new HashSet<>();
        for (String s : a) {
            set.add(s);
        }
        boolean commonFound = false;
        for (String s : b) {
            if (set.contains(s)) {
                System.out.println("Common string is: " + s);
                commonFound = true;
            }
        }
        if (!commonFound) {
            System.out.println("No common string found");
        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int b[] = { 2, 6, 7 };
        System.out.println("Array1: " + Arrays.toString(a));
        System.out.println("Array2: " + Arrays.toString(b));
        int ans = commonInt(a, b);
        System.out.println("Common integer between two arrays is: " + ans);
        String[] c = { "abc", "bc", "cd" };
        String[] d = { "bc", "dc", "abcd" };
        commonStr(c, d);
    }
}
