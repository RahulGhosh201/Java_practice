import java.util.*;

public class SumEvenOdd {

    public static void soln(int[] arr) {
        int sumOdd = 0, sumEven = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sumEven += arr[i];
            } else {
                sumOdd += arr[i];
            }
        }
        System.out.println("Sum of even positioned elemnets in the array: " + sumEven);
        System.out.println("Sum of odd positioned elmenets are: " + sumOdd);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        soln(arr);
    }
}