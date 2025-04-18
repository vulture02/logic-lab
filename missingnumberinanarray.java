package DSA;

public class missingnumberinanarray {
    public static void main(String[] args) {
        int arr[]={1,3};
        System.out.println(missing(arr));
    }
    public static int missing(int arr[]){
        for (int i=0;i<=arr.length;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return -1;
    }
}
