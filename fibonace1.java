package DSA;

public class fibonace1 {
    public static void main(String[] args) {
        System.out.println(fibonace(4));
    }
    static  int fibonace(int n){
        if(n==0){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        else {
            return fibonace(n-1)+fibonace(n-2);
        }
    }
}
