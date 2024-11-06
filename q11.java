import java.util.*;

public class q11 {
    public static void main(String[] args) {
        int[][] a = new int[2][2];
        int[][] b = { { 1, 2 },
                { 3, 4 } };
        System.out.println("Enter elements of a: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int c[][] = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Ans: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
}