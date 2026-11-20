package JavaPractice.Operators;

import java.util.Scanner;

public class lastDigitOfNumberex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number:");
        int n   =   sc.nextInt();
        int x   =   Math.abs(n);
        int result  =   x   %   10;

        System.out.println("Last Digit Of Number:"+result);
        sc.close();
    }
}
