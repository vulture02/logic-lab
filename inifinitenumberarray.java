//Find position of element in a sorted array of inifinit number

package DSA;

public class inifinitenumberarray{
    public static void main(String[] args) {
        int []arr={10,20,30,45,86,95,236,486,987,4562,7894};
        int target=95;
        System.out.println(ans(arr,target));



    }
    static int ans(int arr[] ,int target){
        int start=0;
        int end=1;
        while (target>arr[end]){
            int t=end+1;
            end=end+(end-start+1)*2;
            start=t;

        }
        return binarysearch(arr,target,start,end);
    }
    static int binarysearch(int []arr,int target,int start,int end){
        while (start<=end) {
            int mid = start+(end-start) /2;
            if(target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }
            else {
                return mid;
            }

        }
        return -1;
    }
}
