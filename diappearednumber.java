package DSA;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class diappearednumber {
    public static void main(String[] args) {
        int nums[] = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer>result=findDisappearedNumbers(nums);
        System.out.println(result);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[correct] != nums[i]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }
    public static void swap(int[] nums,int frist,int second){
        int temp=nums[frist];
        nums[frist]=nums[second];
        nums[second]=temp;
    }
}
