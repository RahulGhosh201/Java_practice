import java.util.*;

public class ReverseOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        if (soln(n) != -1) {
            System.out.println("Reverse of " + n + " is: " + soln(n));
        } else {
            System.out.println("Can not reverse");
        }
        sc.close();
    }

    public static int soln(int n) {
        if (n % 2 == 0) {
            return -1;
        }
        int ans = 0;
        while (n != 0) {
            int rem = n % 10;
            ans = ans * 10 + rem;
            n /= 10;
        }
        return ans;
    }
}