package JavaPractice.Operators;

import java.util.Scanner;

public class Apterm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Term:");
        int a   =   sc.nextInt();

        System.out.println("Enter Common Difference:");
        int d   =   sc.nextInt();

        System.out.println("Enter Nth term:");
        int n   =   sc.nextInt();

        double AP  =   a   +   (n  -   1);
        System.out.printf("%.3f",AP);
        sc.close();
    }
}
