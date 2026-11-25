package JavaPractice.Operators;

import java.util.Scanner;

public class BitwiseShiftOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st The Number:");
        int a   =   sc.nextInt();

        System.out.println("Enter The 2nd Number:");
        int b   =   sc.nextInt();

        int rs  =   a >> b   ;
        int opt =   a << b   ;

        System.out.println(rs    +   " " +   opt);
        sc.close();
    }
}
