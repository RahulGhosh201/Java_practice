import java.util.*;

public class Str2Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter str: ");
        String s = sc.nextLine().toLowerCase();
        String[] str = s.split(" ");// space die alada kore j string gulo generate hobe se gulo diei string array ta
                                    // create hoche
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            for (int j = 1; j < str[i].length(); j++) {
                if (isVowel(str[i].charAt(j)) == true && isVowel(str[i].charAt(j - 1)) == true) {
                    count++;
                    break;
                }
            }
        }
        System.out.println("Ans: " + count);

    }

    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }
}