package JavaPractice.Operators;

public class leftShift {
    public static void main(String[] args){
        int s   =   3;
        System.out.println(s<<1);
        System.out.println(s<<2);
        System.out.println(s<<3);
        System.out.println(s<<4);
        System.out.println(s<<30);

        int y   =   4;
        int a   =   (y<<s);
        System.out.println(a);

    }
}
