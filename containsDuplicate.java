// contain duplicate element
package DSA;

public class containsDuplicate {
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        System.out.println(containsDuplicat(arr));
    }
    public static boolean containsDuplicat(int[] nums) {
        int count=0;
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<i;j++){
                if (nums[i]==nums[j]){
                    count++;
                    break;
                }
            }
        }
        if (count>0){
            return true;
        }
        return false;

    }
}
