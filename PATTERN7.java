package DSA;

public class PATTERN7 {
    public static void main(String[] args) {
        sqare(4);
    }
    public static void sqare(int n){
        int original=n;
        n=2*n;
        for (int row=0;row<=n;row++){
            for (int col=0;col<=n;col++){
                int indexrow=original-Math.min(Math.min(row ,col),Math.min(n-row,n-col));
                System.out.print(indexrow+" ");
            }
            System.out.println();
        }
    }
}
