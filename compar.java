package DSA;

import javax.crypto.spec.PSource;

public class compar {
    public static void main(String[] args) {
        String a="amith";
        String b="amith";
        System.out.println(a==b);
        String c= new  String("kunal");
        String d=new String("kunal");
        System.out.println(c==d);

        //to check only a values
        System.out.println("only checking values "+c.equals(d));//if any changes in value it will give false
        System.out.println(c.charAt(0));//it will print charcter that string

    }


}
