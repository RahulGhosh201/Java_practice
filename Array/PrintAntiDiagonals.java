import java.util.*;

public class PrintAntiDiagonals {

    public static void soln(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i <= 2 * (n - 1); i++) {
            for (int j = 0; j < n; j++) {
                int k = i - j;
                if (k >= 0 && k < n) {
                    System.out.println(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the elements in the two dimensional array: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        soln(arr);
        sc.close();
    }
}