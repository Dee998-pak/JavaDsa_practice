package JavaPractice.Operators;

import java.util.Scanner;

public class Q2LeftShift {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The 1st Number:");
        int c   =   sc.nextInt();

        System.out.println("Enter The Second Number:");
        int d   = sc.nextInt();

        int output  =   c   <<  d   ;

        System.out.println("LeftShift:"+output);
        sc.close();
    }
}
