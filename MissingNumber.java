package DSA;
//https://leetcode.com/problems/missing-number/submissions/1600786502/
public class MissingNumber {
    public static void main(String[] args) {
        int arr[]={4,0,2,1};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
        int i=0;
        while (i<nums.length){
            int correct=nums[i];
            if (nums[i]<nums.length && nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else {
                i++;
            }
        }
        for (int index=0;index<nums.length;index++){
            if (index!=nums[index]){
                return index;
            }
        }
        return nums.length;
    }
    static  void  swap( int arr[],int frist,int second ){
        int temp=arr[frist];
        arr[frist]=arr[second];
        arr[second]=temp;
    }
}
