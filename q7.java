import java.util.*;

public class q7 {
    public static void main(String[] args) {
        String[] str = { "bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu" };
        Set<String> set = new HashSet<>();
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    set.add(str[j]);
                }
            }
        }
        System.out.println(set);
    }
}
