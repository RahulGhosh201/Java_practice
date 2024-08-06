import java.util.*;

public class Average {
    public static int avg(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum / arr.length;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("Enter array elements: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Average of the array elements: " + avg(arr));
    }
}