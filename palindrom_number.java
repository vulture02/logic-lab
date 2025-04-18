package DSA;

public class palindrom_number {
    public static void main(String[] args) {
        int x=121;
        System.out.println(palindrom(x));
    }
    public static boolean palindrom(int x){
        int n=x;
        int cons=0;
        while (n>0){
           int rem=n%10;
            cons=cons*10+rem;
            n=n/10;
        }
      if (x==cons){
          return true;
      }
      return false;

    }

}
