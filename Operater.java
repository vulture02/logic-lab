package DSA;

import java.util.ArrayList;
import java.util.Arrays;

public class Operater {
    public static void main(String[] args) {
        System.out.println('a'+'b');//converting ask value in character
        System.out.println("a"+"b");
        System.out.println('a'+3);//character and number can add by converting to its decimal value
        System.out.println((char) ('a'+3));//typecasting
        System.out.println("a"+1);
        //this is same as the few steps:"a"+"1"
        // integer will  converted into Integer that will call toString()
        System.out.println("amith"+new ArrayList<>());//cearting array list i is object
        System.out.println("amith"+new Integer(56));//object

        System.out.println(new ArrayList<>()+" "+Integer.toString(89));
    }
}
