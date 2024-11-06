import java.util.*;

public class q6 {
    public static int[] soln(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int num : arr) {
            int count = map.getOrDefault(num, 0);// it returns the count of the num
            if (count == 1) {
                duplicates.add(num);
            }
            map.put(num, count + 1);// it updates the frequency count
        }

        int[] ans = new int[duplicates.size()];
        int index = 0;
        for (int num : duplicates) {
            ans[index++] = num;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 3, 2, 4, 5, 6 };
        int[] temp = soln(arr);
        System.out.println("Duplicate elements are: " + Arrays.toString(temp));
    }
}
