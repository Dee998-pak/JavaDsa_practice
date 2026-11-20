package JavaPractice.Operators;

import java.util.Scanner;

public class Arithmaticprogressionex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Term:");
        int a   =   sc.nextInt();

        System.out.println("Enter Common Difference:");
        int d   =   sc.nextInt();

        System.out.println("Enter Nth Term:");
        int n   =   sc.nextInt();

        int result  =   a   +   (   n   -   1 )*d;
        System.out.println("Ap:"+result);
        sc.close();
    }
}
