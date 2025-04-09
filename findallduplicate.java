package DSA;

import java.util.ArrayList;
import java.util.List;

public class findallduplicate {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = new findallduplicate().findDuplicates(nums);
        System.out.println(result);

    }
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while (i<nums.length){
                int current=nums[i]-1;
                if( nums[i]!=nums[current]){
                    swap(nums,i,current);
                }else {
                    i++;
                }

            }
        List<Integer> ans=new ArrayList<>();
        for (int index=0;index<nums.length;index++){
            if (nums[index]!=index+1){
                ans.add(nums[index]);
            }
        }
        return ans;



    }
    public static void swap(int[] nums, int frist, int second){
        int temp=nums[frist];
        nums[frist]=nums[second];
        nums[second]=temp;
    }
}
