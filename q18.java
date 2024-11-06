import java.util.*;

public class q18 {

    public static String sortString(String a) {
        char[] temp = a.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }

    public static boolean soln(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        // String c = sortString(a);
        // String d = sortString(b);
        // if (c.equals(d)) {
        // return true;
        // } else {
        // return false;
        // }
        int[] freq = new int[26];
        int n = a.length();
        for (int i = 0; i < n; i++) {
            char chA = a.charAt(i);
            freq[chA - 'a']++;

            char chB = b.charAt(i);
            freq[chB - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "silent", b = "tlensi";
        if (soln(a, b)) {
            System.out.println("Anagrm to each other");
        } else {
            System.out.println("Not anagram to each other");
        }
    }
}
