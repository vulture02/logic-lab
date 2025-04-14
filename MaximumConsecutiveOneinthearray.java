package DSA;
//https://takeuforward.org/data-structure/count-maximum-consecutive-ones-in-the-array/
public class MaximumConsecutiveOneinthearray {
    public static void main(String[] args) {
        int arr[]={1, 1, 0, 1, 1, 1,0,1,1,0,1,1,1,1,1,1};
        ones(arr);

    }
    public static void ones(int arr[]){
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==1){
                count++;
            } else if (arr[i]==0) {
                count=0;

            }
        }
        System.out.println(count);
    }
}

