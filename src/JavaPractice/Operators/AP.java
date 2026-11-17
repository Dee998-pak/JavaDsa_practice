package JavaPractice.Operators;

import java.util.Scanner;

public class AP {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Term:");
        int a   =   sc.nextInt();

        System.out.println("Enter term position:");
        int n   =   sc.nextInt();

        System.out.println("Enter Common Difference:");
        int d   =   sc.nextInt();

        int ap  =   a   +   ( n -   1 )*d;

        System.out.println("AP:"+ap);
        sc.close();

    }
}
