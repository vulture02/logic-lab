package DSA;

public class patterndiamond {
    public static void main(String[] args) {
        int n=5;
        for (int row=0;row<2*n;row++){
            int total=row>n?2*n-row:row;
            int toatlspace=n-total;
            for (int s=0;s<toatlspace;s++){
                System.out.print(" ");
            }
            for (int col=0;col<total;col++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
