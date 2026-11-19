package JavaPractice.Operators;

import java.util.Scanner;

public class SONNaturalnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number:");
        int x   =   sc.nextInt();
        int y   =Math.abs(x);
        int result  =   y%10;

        System.out.println("The Last Digit of Number:"+result);
        sc.close();
    }
}
