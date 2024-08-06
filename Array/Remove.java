import java.util.*;

public class Remove {

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void elementRemoval(int[] arr, int index) {
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 7, 8, 3, 1 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter key: ");
        int key = sc.nextInt();
        System.out.println("Before removal: ");
        printArr(arr);
        elementRemoval(arr, key);
        System.out.println("After removal: ");
        printArr(arr);
    }
}
import java.util.*;

public class Remove {

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void elementRemoval(int[] arr, int index) {
        for (int i = index; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 7, 8, 3, 1 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter key: ");
        int key = sc.nextInt();
        System.out.println("Before removal: ");
        printArr(arr);
        elementRemoval(arr, key);
        System.out.println("After removal: ");
        printArr(arr);
    }
}
import java.util.*;

public class Remove {

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void elementRemoval(int[] arr, int index) {
        for (int i = index; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 7, 8, 3, 1 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter key: ");
        int key = sc.nextInt();
        System.out.println("Before removal: ");
        printArr(arr);
        elementRemoval(arr, key);
        System.out.println("After removal: ");
        printArr(arr);
    }
}