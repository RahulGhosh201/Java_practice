import java.util.*;

public class MissingElement {

    public static int soln(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        int total = 0, sumOfArr = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfArr += arr[i];
        }
        for (int i = smallest; i <= largest; i++) {
            total += i;
        }
        return (total - sumOfArr);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 7 };
        int ans = soln(arr);
        System.out.println("Missing element in the array is: " + ans);
    }
}