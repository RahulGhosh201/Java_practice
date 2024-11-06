import java.util.*;

public class SpaceCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter str: ");
        String str = sc.nextLine();
        soln(str);
        sc.close();
    }

    public static void soln(String s) {
        int scnt = 0, ccnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                scnt++;
            } else {
                ccnt++;
            }
        }
        System.out.println("Space count: " + scnt + "Character count: " + ccnt);
    }
}