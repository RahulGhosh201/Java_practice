import java.util.*;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements in the array before sorting: " + Arrays.toString(arr));
        Arrays.sort(arr);

        System.out.println("Elements in the array after sorting: " + Arrays.toString(arr));
        int res = 0;
        for (int num : arr) {
            res += num;
        }
        System.out.println("Sum of the array elements: " + res);
        sc.close();

    }
}