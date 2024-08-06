import java.util.*;

public class Copy {
    public static void main(String[] args){
        int[] arr={1,5,8,3,10};
        System.out.println("Original array: "+Arrays.toString(arr));
        int[] new_arr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            new_arr[i]=arr[i];
        }
        System.out.println("Copied array: "+Arrays.toString(new_arr));
    }
}