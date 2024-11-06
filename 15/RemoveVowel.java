import java.util.*;

public class RemoveVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter str: ");
        String s = sc.nextLine();
        System.out.println("Ans: " + soln(s));
        sc.close();
    }

    public static String soln(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (!isVowel(s.charAt(i))) {
                str += s.charAt(i);
            }
        }
        return str;
    }

    public static boolean isVowel(char ch) {
        char c = Character.toLowerCase(ch);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }
}