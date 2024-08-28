import java.util.*;

public class Combo {
    public static Boolean soln1(int[] arr) {
        for (int num : arr) {
            if (num == 0 || num == -1) {
                return false;
            }
        }
        return true;
    }

    public static Boolean soln2(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num == 10) {
                sum += 10;
            }
        }
        return (sum == 30);
    }

    public static Boolean soln3(int[] arr) {
        int cnt = 0;
        for (int num : arr) {
            if (num == 65 || num == 77) {
                cnt++;
            }
        }
        return (cnt == 2);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 10, 10, 65, 77 };
        if (soln1(arr)) {
            System.out.println("Array is without 0 and -1");
        } else {
            System.out.println("Array contains 0 or -1");
        }

        if (soln2(arr)) {
            System.out.println("Sum of all 10's is exactly 30");
        } else {
            System.out.println("Sum of all 10's is exactly 30");
        }

        if (soln3(arr)) {
            System.out.println("Array contain 65 and 77");
        } else {
            System.out.println("Array does not contain 65 and 77");
        }
    }
}