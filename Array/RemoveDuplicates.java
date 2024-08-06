import java.util.*;

public class RemoveDuplicates {
    public static int[] soln(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int n : arr) {
            set.add(n);
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 2, 4, 6, 1, 3 };
        System.out.println("Original array: " + Arrays.toString(arr));
        int[] res = soln(arr);
        System.out.println("Modified array after removing duplicate elements: " + Arrays.toString(res));
    }

}
