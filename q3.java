import java.util.*;

public class q3 {

    public static boolean contains(int[] arr, int low, int high, int key) {
        // for (int num : arr) {
        // if (num == key) {
        // return true;
        // }
        // }
        // return false;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return true;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter key: ");
        int key = sc.nextInt();
        Arrays.sort(arr);
        System.out.println(contains(arr, 0, n - 1, key));
    }
}
