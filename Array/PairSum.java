import java.util.*;

public class PairSum {

    public static void soln(ArrayList<Integer> arr, int sum) {
        System.out.println("Possible pairs are: ");
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    System.out.println("{ " + arr.get(i) + ", " + arr.get(j) + "}");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sum: ");
        int sum = sc.nextInt();
        // int[] arr = new int[5];
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter 5 elements: ");
        for (int i = 0; i < 5; i++) {
            // arr[i] = sc.nextInt();
            int temp = sc.nextInt();
            arr.add(temp);
        }
        soln(arr, sum);
        sc.close();
    }
}