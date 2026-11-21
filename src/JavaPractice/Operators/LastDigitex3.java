package JavaPractice.Operators;

import java.util.Scanner;

public class LastDigitex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int a   =   sc.nextInt();
        int x   =   Math.abs(a);
        int ans   =   x%10;

        System.out.println("Last Digit:"+ans);
        sc.close();
    }
}
