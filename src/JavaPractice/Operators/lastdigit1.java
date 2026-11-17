package JavaPractice.Operators;

import java.util.Scanner;

public class lastdigit1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n   =   -159;
        int y   =   Math.abs(n);
        int result  =   y%10;

        System.out.println("Final Result:"+result);
        sc.close();
    }
}
