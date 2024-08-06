import java.util.*;

public class Conversion {
    public static void main(String[] args) {
        String[] str = { "Banana", "Apple", "Orange", "Apple" };
        ArrayList list = new ArrayList(Arrays.asList(str));// this way we are converting the array to an arrayList
        System.out.println(list);

        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("C++");
        arrList.add("Java");
        arrList.add("Python");
        String[] arr = new String[arrList.size()];
        arrList.toArray(arr);// this way we are converting arrayList to array
        for (String s : arr) {
            System.out.println(s);
        }
    }
}