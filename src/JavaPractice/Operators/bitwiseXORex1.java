package JavaPractice.Operators;

import java.util.Scanner;

public class bitwiseXORex1 {
    public static void  main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number:");
        int x   =   sc.nextInt();

        System.out.println("Enter Second Number:");
        int d   =   sc.nextInt();

        int xor =   x   ^   d   ;
        System.out.println("The Xor values Becomes:"+xor);
        sc.close();
    }
}
