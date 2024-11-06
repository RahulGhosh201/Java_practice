import java.util.*;

public class SameLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter str: ");
        String s = sc.nextLine();
        System.out.println("Ans: " + soln(s));
        sc.close();
    }

    public static int soln(String s) {
        int cnt = 0;
        String[] arr = s.split("[\\s,]+");
        for (int i = 0; i < arr.length; i++) {
            if (isRev(arr[i])) {
                cnt++;
            }
        }
        return cnt;
    }

    public static boolean isRev(String s) {
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return true;
        }
        return false;
    }
}
