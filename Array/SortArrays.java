import java.util.*;

public class SortArrays {
    public static void sortNumericArrays(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void sortStringArray(String[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printArray(String[] arr) {
        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 7, 1 };
        System.out.println("Original numeric array: ");
        printArray(arr);
        sortNumericArrays(arr);
        System.out.println("Sorted number array: ");
        printArray(arr);

        String[] stringArr = { "Banana", "Apple", "Orange", "Mango", "Grapes" };
        System.out.println("Original string array: ");
        printArray(stringArr);
        sortStringArray(stringArr);
        System.out.println("Sorted string array: ");
        printArray(stringArr);
    }
}
