package JavaPractice.Operators;

import java.util.Scanner;

public class RelationalOperatorsex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The First Number:");
        int s   =   sc.nextInt();

        System.out.println("Enter The Second Number:");
        int f   =   sc.nextInt();

        boolean a   =   s>f;
        boolean b   =   s>f;
        boolean c   =   s==f;
        boolean d   =   s!=f;
        boolean e   =   s>=f;
        boolean g   =   s<=f;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(g);
        sc.close();
    }

}
