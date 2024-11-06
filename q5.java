import java.util.*;

public class q5 {

    public static void reverseArr(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 4 };
        System.out.println("Originl array: " + Arrays.toString(arr));
        reverseArr(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}
