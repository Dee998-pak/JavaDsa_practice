package JavaPractice.Operators;

import java.util.Scanner;

public class SumOfNnaturalNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Natural Natural Number:");
        int n   =   sc.nextInt();

        int sum =   n*(n+1);
        System.out.println(sum);
        sc.close();
    }
}
