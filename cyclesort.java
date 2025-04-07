package DSA;

import java.util.Arrays;

public class cyclesort {
    public static void main(String[] args) {
            int arr[]={3,5,2,1,4};
            sort(arr);
        System.out.println(Arrays.toString(arr));;
    }
    static void sort(int []arr){
        int i=0;
        while (i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
    }
    static void swap(int[] arr,int frist,int second){
        int temp=arr[frist];
        arr[frist]=arr[second];
        arr[second]=temp;
    }
}
