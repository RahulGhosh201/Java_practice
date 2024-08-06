import java.util.*;

public class Duplicate {

    public static int duplicateNum(int[] arr) {
        Set<Integer> set = new HashSet<>();
        boolean duplicateFound = false;
        int ans = 0;
        for (int num : arr) {
            if (!set.add(num)) {// if the element is present in the set, add() returns false mane ekhane num
                                // already jodi present thake tahole add() false return korbe and !false=true
                                // so, if condition follows and vitore jete parbo
                ans = num;
                duplicateFound = true;
                break;
            }
        }
        return ans;
    }

    public static void duplicateString(String[] str) {
        Set<String> set = new HashSet<>();
        boolean duplicateFound = false;

        for (String s : str) {
            if (!set.add(s)) { // If the string is already in the set, add() returns false
                System.out.println("Duplicate found: " + s); // Print the duplicate string
                duplicateFound = true;
                break; // Stop after finding the first duplicate
            }
        }

        if (!duplicateFound) {
            System.out.println("No duplicates found.");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 4 };
        String[] str = { "bcd", "abd", "jude", "bcd", "oiu" };
        int ans = duplicateNum(arr);
        System.out.println("Duplicate number: " + ans);
        duplicateString(str);
    }
}