import java.util.*;

public class q9 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 6, 3, 2, 1, 6, 4 };
        // Set<Integer> set = new HashSet<>();
        // for (int num : arr) {
        // set.add(num);
        // }
        // int[] ans = new int[set.size()];
        // int j = 0;
        // for (int num : set) {
        // ans[j++] = num;
        // }
        // System.out.println("Original arr: " + Arrays.toString(arr));
        // System.out.println("Modified array: " + Arrays.toString(ans));
        // int n = arr.length;
        // int[] temp = new int[n];
        // int index = 0;
        // for (int i = 0; i < n; i++) {
        // boolean isDuplicate = false;
        // for (int j = 0; j < n; j++) {
        // if (i != j && arr[i] == arr[j]) {
        // isDuplicate = true;
        // break;
        // }
        // }
        // if (!isDuplicate) {
        // temp[index++] = arr[i];
        // }
        // }
        // int[] ans = new int[index];
        // for (int i = 0; i < index; i++) {
        // ans[i] = temp[i];
        // }
        // System.out.println(Arrays.toString(ans));
        int n = arr.length;
        int[] temp = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[index++] = arr[i];
            }
        }
        int[] ans = new int[index];
        for (int i = 0; i < index; i++) {
            ans[i] = temp[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
