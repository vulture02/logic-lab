package DSA;
//https://www.geeksforgeeks.org/chocolate-distribution-problem/
import java.util.Arrays;

public class ChocolateDistribution {
    public static void main(String[] args) {
        int arr[]={7, 3, 2, 4, 9, 12, 56,89};
        int m=4;
        int min=distruction(arr,m);
        System.out.println(min);
    }
    public static int distruction(int arr[],int m){
        if (arr.length<m){
            return -1;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int min=Integer.MAX_VALUE;
        int i = 0;
        while (i< arr.length && m+i-1< arr.length) {
            int diff = arr[m + i - 1] - arr[i];
            if (diff < min) {
                min = diff;
            }
            i++;
        }
        return min;

    }
}
//[2, 3, 4, 7, 9, 12, 56, 89]
//5 output