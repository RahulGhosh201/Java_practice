import java.util.*;

public class AddMatrices {

    public static void soln(int a[][], int b[][], int m, int n) {
        int sum[][] = new int[m][n];
        System.out.println("Sum of the two matrices: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows in the matrices: ");
        int m = sc.nextInt();
        System.out.println("Enter number of columns in the matrices:  ");
        int n = sc.nextInt();
        int arr1[][] = new int[m][n];
        int arr2[][] = new int[m][n];

        System.out.println("Enter elements in the first matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Eneter elements in the second matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr2[m][n] = sc.nextInt();
            }
        }

        soln(arr1, arr2, m, n);
        sc.close();

    }
}
