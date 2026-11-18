package JavaPractice.Operators;

import java.util.Scanner;

public class LastDigitNumber {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number:");
        int n   =   sc.nextInt();
        int y   =   Math.abs(n);
        int ans =   y % 10;

        System.out.println(ans);
    }
}
