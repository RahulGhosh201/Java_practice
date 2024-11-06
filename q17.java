import java.util.*;

public class q17 {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2 },
                { 3, 4 } };
        int x = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (i + j == x) {
                    System.out.println(arr[i][j]);
                }
            }
            System.out.println();
            x++;
        }
    }
}
// 0,0 0,1 0,2
// 1,0 1,1 1,2
// 2,0 2,1 2,2

// 0,0
