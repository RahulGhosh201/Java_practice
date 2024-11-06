import java.util.*;

public class SumPrime {
    public static void main(String[] args) {
        String s = "2345678910";
        System.out.println("Ans: " + soln(s));
    }

    public static int soln(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                if (isPrime(s.charAt(i) - '0')) {
                    ans += (s.charAt(i) - '0');
                }
            }
        }
        return ans;
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}