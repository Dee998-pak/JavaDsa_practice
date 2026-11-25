package JavaPractice.Operators;

import java.util.Scanner;

public class Q10UserInputBothOperators {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr The Number:");
        int     p   =   sc.nextInt();

        System.out.println("Enter The Number:");
        int     q   =   sc.nextInt();

        int output  =   p   >>  q;
        int result  =   p   <<  q;

        System.out.println("UserInputBothOperators:"    +   output  +   " " +   result);
        sc.close();
    }
}
