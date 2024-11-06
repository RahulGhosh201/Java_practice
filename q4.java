import java.util.*;

public class q4 {
    public static void main(String[] args) {
        int[] arr = { 25, 14, 56, 15, 36 };
        // int key = 56;
        // int[] temp = new int[arr.length - 1];
        System.out.println("Elements in original array: " + Arrays.toString(arr));
        // int j = 0;
        // for (int num : arr) {
        // if (num != key) {
        // temp[j++] = num;
        // }
        // }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index: ");
        int index = sc.nextInt();
        System.out.println("Enter key: ");
        int key = sc.nextInt();
        int[] temp = new int[arr.length + 1];
        int i = 0, j = 0;
        while (i < index) {
            temp[j++] = arr[i++];
        }
        temp[j++] = key;
        while (i < arr.length) {
            temp[j++] = arr[i++];
        }

        System.out.println("Elements in modified array: " + Arrays.toString(temp));
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        for (int num : arr) {
            // maxi = Math.max(maxi, num);
            // mini = Math.min(mini, num);
            if (num < mini) {
                mini = num;
            }
            if (num > maxi) {
                maxi = num;
            }
        }
        System.out.println("Maximum element: " + maxi + " Minimum element: " + mini);

    }
}
