package DSA;

public class patternreversestar {
    public static void main(String[] args) {
     for (int i=0;i<5;i++){
         for (int j=0;j<5-i-1;j++){
             System.out.print("*");
         }
         System.out.println();
     }
    }
}
