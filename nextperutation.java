package DSA;

import java.util.Arrays;

public class nextperutation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void nextPermutation(int[] nums) {
        int ind=-1;
        int n=nums.length;
        for (int i=n-2;i>=0;i--){
            if (nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if (ind==-1){
           reverse(nums,0,n-1);
        }
        for (int i=n-1;i>ind;i++){
            if (nums[i]>nums[ind]){
                swap(nums,i,ind);
                break;
            }
        }
        reverse(nums,ind+1,n-1);


    }
    public static  void   swap(int []nums,int f, int s){
        int temp=nums[f];
        nums[f]=nums[s];
        nums[s]=temp;
    }
    public static void reverse(int num[],int ind,int end){
        while (ind<end){
            swap(num,ind,end);
            ind++;
            end--;
        }
    }
}
