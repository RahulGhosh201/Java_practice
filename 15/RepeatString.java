import java.util.*;

public class RepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in the string array: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        System.out.println("Enter elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        String ans = soln(arr);
        System.out.println("Ans: " + ans);
        sc.close();
    }

    public static String soln(String[] arr) {
        String s = "";
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i].charAt(0))) {
                cnt += (i + 1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        String ans = "";
        for (int i = 0; i < cnt; i++) {
            ans += s;
        }
        return ans;
    }
}
