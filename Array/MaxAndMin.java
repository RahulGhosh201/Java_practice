import java.util.*;

public class MaxAndMin {
    public static int max(int[] arr){
       int ans=arr[0];
       for(int i=0;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            } 
       } 
       return ans;
    }

    public static int min(int[] arr){
        int ans=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in the array: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum elements: "+max(arr));
        System.out.println("Minimum elements: "+min(arr));
        sc.close();
    }
}