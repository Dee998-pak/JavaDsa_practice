package JavaPractice.Operators;

import java.util.Scanner;

public class ArithmaticProgression {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter The First term:");
        int a   =   sc.nextInt();

        System.out.println("Enter the Common Difference:");
        int d   =   sc.nextInt();

        System.out.println("Enter The Nth Term:");
        int n   =   sc.nextInt();

        int result  =   a   +(n -   1)*d;

        System.out.println("The Arithmatic Progression Becomes:"+result);
        sc.close();
    }
}
