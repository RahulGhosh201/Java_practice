import java.util.*;

public class SortingName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[3];
        System.out.println("Enter elements in the array: ");
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextLine();
        }
        soln(arr);

    }

    public static void soln(String[] arr) {
        String temp = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
