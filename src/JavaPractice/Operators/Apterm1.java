package JavaPractice.Operators;

import java.util.Scanner;

public class Apterm1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The First Term:");
        int a   =   sc.nextInt();

        System.out.println( "Enter The Common Difference:");
        int d   =   sc.nextInt();

        System.out.println("Enter The Nth Term:");
        int n   =   sc.nextInt();

        int Ap  =   a   +( n    -   1)*d;
        System.out.println("Arithmatic Progression:"+Ap);
        sc.close();
    }
}
