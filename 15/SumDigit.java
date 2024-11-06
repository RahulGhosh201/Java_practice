
import java.util.*;

public class SumDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Ans: " + soln(n));
    }

    public static int soln(int n) {
        int ans = sum(n);
        while (ans > 9) {
            ans = sum(ans);
        }
        return ans;
    }

    public static int sum(int n) {
        int s = 0;
        while (n != 0) {
            int rem = n % 10;
            s += rem;
            n /= 10;
        }
        return s;
    }

}
