package DSA;

import java.util.Arrays;

public class reversenumber {
    public static void main(String[] args) {
        int arr[]={1, 4, 3, 2, 6, 5};
        rverse(arr);
    }
    static void rverse(int []arr){
        int temp;
        for (int i=0;i<arr.length/2;i++){
             temp=arr[i];
             arr[i]=arr[arr.length-i-1];
             arr[arr.length-i-1]=temp;
             

        }
        System.out.println(Arrays.toString(arr));

    }
}
