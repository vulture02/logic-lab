package DSA;

import java.util.Arrays;

public interface MoveallZerostotheendofthearray {
    public static void main(String[] args) {
        int arr[]={ 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        end(arr);

    }
    static  void end(int arr[]){
        int j=-1;
        for (int i=0; i<arr.length;i++){
            if (arr[i]==0){
                 j=i;
                 break;
            }
        }
        for (int i=j+1;i<arr.length;i++){
            if (arr[i]!=0){
                swap(arr,i,j);
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
     static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
//output [1, 2, 3, 4, 1, 0, 0, 0]