import java.util.*;

public class SumEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter elements in the array: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        sc.nextLine();
        System.out.println("Enter str: ");
        String s = sc.nextLine();
        System.out.println("Ans: " + soln(s));
        sc.close();
    }

    public static int soln(String s) {
        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] % 2 == 0) {
        // sum += arr[i];
        // }
        // }
        // return sum;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                if ((s.charAt(i) - '0') % 2 == 0) {
                    sum += s.charAt(i) - '0';
                }
            }
        }
        return sum;
    }
}