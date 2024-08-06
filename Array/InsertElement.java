import java.util.*;

public class InsertElement {

    public static void soln(int[] arr, int index, int value) {
        int[] new_arr = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            new_arr[i] = arr[i];
        }
        new_arr[index] = value;
        for (int i = index; i < arr.length; i++) {
            new_arr[i + 1] = arr[i];
        }
        System.out.println("Modified array: " + Arrays.toString(new_arr));
    }

    public static void main(String[] args) {
        int[] arr = { 25, 14, 56, 15, 36 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index: ");
        int index = sc.nextInt();
        System.out.println("Enter value to be inserted: ");
        int value = sc.nextInt();
        System.out.println("Original array: " + Arrays.toString(arr));
        soln(arr, index, value);

    }
}