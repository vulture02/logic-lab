package DSA;

public class Sbuild {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();//mutable
        for (int i=0;i<26;i++){
            char ch=(char) ('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);
    }
}
