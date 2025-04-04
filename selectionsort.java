package DSA;

import java.lang.reflect.Array;
import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int []arr={5,6,9,7,8,1,2,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[]arr){
        for (int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxele=maxele(arr,0,last);
            swap(arr,maxele,last);
        }
    }
    static void swap(int[] arr, int max, int end){
        int temp=arr[max];
        arr[max]=arr[end];
        arr[end]=temp;

    }


    static int maxele(int[] arr, int start, int last) {
        int max=start;
        for (int i=start;i<=last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;

    }

}
