import java.util.*;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter str: ");
        String s = sc.nextLine();
        System.out.println("Ans: " + soln(s));
        sc.close();
    }

    public static int soln(String s) {
        int sum = 0, num = 0;
        for (int i = 0; i < s.length(); i++) {
            // int num = 0;
            if (Character.isDigit(s.charAt(i))) {
                num = num * 10 + s.charAt(i) - '0';
            } else if (num != 0) {
                sum += num;
                num = 0;
            }
        }
        if (num > 0)
            sum += num;
        return sum;
    }
}