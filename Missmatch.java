package DSA;
//https://leetcode.com/problems/set-mismatch/
import java.util.Arrays;

public class Missmatch {
    public static void main(String[] args) {
        int arr[]={1,2,2,4};
        int [] a=findErrorNums(arr);
        System.out.println(Arrays.toString(a));


    }
    public static int[] findErrorNums(int[] nums) {
        int i=0;
        while (i<nums.length){
            int correct =nums[i]-1;
            if (nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else {
                i++;
            }
        }
        for (int index=0;index<nums.length;index++){
            if (nums[index]!=index+1){
                return new int[] {nums[index],index+1};
            }
        }
        return new int[]{-1,-1};
    }
    public static void swap(int[] nums, int frist, int second){
        int temp=nums[frist];
        nums[frist]=nums[second];
        nums[second]=temp;
    }
}
