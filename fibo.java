package DSA;
//uing formula nfibbonace
public class fibo {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            System.out.println(fibonace(i));
        }

    }
    public static int fibonace(int n){
        return  (int)( Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));

    }
}

