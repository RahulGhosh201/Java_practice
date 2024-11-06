import java.util.*;

public class RepeatedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter str: ");
        String s = sc.nextLine();
        soln(s);
        sc.close();
    }

    public static void soln(String s) {
        String ans = "";
        for (int i = 1; i < s.length(); i += 2) {
            if (Character.isDigit(s.charAt(i))) {
                {
                    int n = s.charAt(i) - '0';
                    for (int j = 0; j < n; j++) {
                        System.out.print(s.charAt(i - 1));
                    }
                }
            }
        }
    }
}