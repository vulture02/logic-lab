
//Binary search  program
package DSA;

public class Binary {
    public static void main(String[] args) {
        int []a={1,2,5,6,8,10};
        int target=5;
        System.out.println(binarysearch(a,target));
    }

    private static int binarysearch(int[] a, int target) {
        int start=0;
        int end=a.length-1;
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

}
