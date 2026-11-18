package JavaPractice.Operators;

import java.util.Scanner;

public class SumOfNnaturalnumber1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("EnterNatural Number:");
        int a   =   sc.nextInt();

        double result  =   a*(a+1)/2;
        System.out.printf("%.3f",result);
        sc.close();
    }
}
