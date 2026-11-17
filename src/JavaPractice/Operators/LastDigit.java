package JavaPractice.Operators;

import java.util.Scanner;

public class LastDigit {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x   =   159;
        int y   =   Math.abs(x);
        int ans =   y%10;
        System.out.println("The Answer Becomes:"+ans);
        sc.close();
    }
}
