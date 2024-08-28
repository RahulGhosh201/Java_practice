import java.util.*;

public class Triplet {
    public static int soln(int arr[], int target) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 0, 5, -1, -4 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target: ");
        int target = sc.nextInt();
        int ans = soln(arr, target);
        System.out.println("Possible triplets: " + ans);
    }
}
