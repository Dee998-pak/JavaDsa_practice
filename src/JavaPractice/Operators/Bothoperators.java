package JavaPractice.Operators;

import java.util.Scanner;

public class Bothoperators {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number:");
        int v   =   sc.nextInt();

        System.out.println("Enter The Number:");
        int w   =   sc.nextInt();

        int op1 =   v   >>  w   ;
        int op2 =   v   <<  w   ;

        System.out.println("Both operators:"+   op1 +   " " +   op2);
        sc.close();
    }
}
