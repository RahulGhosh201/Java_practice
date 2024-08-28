import java.util.*;

public class MajorityElement {

    public static void soln(int[]arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<map.size();i++){
            map[arr[i]]++;
        }
        System.out.println("Majority elments are: ");
        for(int i=0;i<map.size();i++){
                if(map[arr[i]/]2>=arr.size())
                    System.out.println(arr[i]);
            }

    public static void main(String[] args) {
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println(" Enter " + n + " elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        soln(arr);
        sc.close();
    }
}
