package DSA;

public class pattern4 {
    public static void main(String[] args) {
        int n=5;
        for (int row=0;row<2*n;row++){
            int totalrow=row>n? 2*n-row:row;
            for (int col=0;col<totalrow;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
