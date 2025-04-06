//Maximum and minimum of an array using minimum number of comparisons

package DSA;

import java.util.Arrays;

public class minmax {
    public static void main(String[] args) {
        int [] arr={56789};
        int [] a= maxmin(arr);
        System.out.println("Maximum element is:"+a[0]);
        System.out.println("Minimum element is:"+a[1]);


    }

    static int[] maxmin(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return new int[]{max, min};

    }
}
