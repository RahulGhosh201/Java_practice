import java.util.*;

public class Reverse {

    public static int reverseNum(int n) {
        int ans = 0;
        while (n != 0) {
            int rem = n % 10;
            ans = ans * 10 + rem;
            n /= 10;
        }
        return ans;
    }

    public static void reverseArr(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static String reverseString(String str) {
        // StringBuilder sb=new StringBuilder(str);
        // String reversed=sb.reverse().toString();
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter a string: ");
        String str = sc.next();
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Number before reverse: " + n);
        int ans = reverseNum(n);
        System.out.println("Number after reverse: " + ans);
        System.out.println("Array before reversal: " + Arrays.toString(arr));
        reverseArr(arr);
        System.out.println("Array after reversal: " + Arrays.toString(arr));
        System.out.println("String before reversal: " + str);
        String res = reverseString(str);
        System.out.println("String after reversal: " + res);
        sc.close();

    }
}