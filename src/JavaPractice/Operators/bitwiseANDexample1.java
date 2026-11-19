package JavaPractice.Operators;

import java.util.Scanner;

public class bitwiseANDexample1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number:");
        int x   =   sc.nextInt();

        System.out.println("Enter Second Number:");
        int y   =   sc.nextInt();

        int result  =   x   &   y;
        System.out.println("The number Becomes:"+result);
        sc.close();
    }
}
