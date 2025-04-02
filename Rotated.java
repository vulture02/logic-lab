//https://leetcode.com/problems/search-in-rotated-sorted-array/description/

package DSA;

public class Rotated {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(pivot(arr));

    }
    static int search(int []num,int target){
        int pivot =pivot(num);
        if (pivot==-1){
           return  binarysearch(num,target,0,num.length-1);
        }
        if (num[pivot]==target){
            return pivot;
        }
        if(target>=num[0]){
            return binarysearch(num,target,0,pivot-1);
        }
        return binarysearch(num,target,pivot+1,num.length-1);
    }
    static int binarysearch(int[] a, int target,int start,int end) {
        while (start<=end) {
            int mid = start+(end-start) /2;
            if(target>a[mid]){
                start=mid+1;
            } else if (target<a[mid]) {
                end=mid-1;
            }
            else {
                return mid;
            }

        }
        return -1;

    }
    static  int pivot(int [] arr){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start + (end - start) / 2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if (mid>start && arr[mid]<arr[mid-1]){
                return  mid-1;
            }
            if (arr[start]>=arr[mid]){
               end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }
}
