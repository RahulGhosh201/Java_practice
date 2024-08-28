import java.util.*;

public class UniqueArrLen {
    public static int soln(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] arr = { 20, 20, 30, 40, 50, 50, 50 };
        System.out.println("Length of the uniqe elements in the array: " + soln(arr));
    }
}
