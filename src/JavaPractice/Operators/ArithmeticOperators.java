package JavaPractice.Operators;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number:");
        int x   =   sc.nextInt();

        System.out.println("Enter Second Number:");
        int y   =   sc.nextInt();

        int add =   x   +   y;
        int sub =   x   -   y;
        int mul =   x   *   y;
        double  div =  (double) x   /   y;
        int mod =   x   %   y;

        System.out.printf("%d %d %d %.3f %d",add,sub,mul,div,mod);
        sc.close();
    }
}
