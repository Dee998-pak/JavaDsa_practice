package JavaPractice.Operators;

import java.util.Scanner;

public class SumOfnNaturalNumberExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number:");
        int n   =   sc.nextInt();

        int sum =   n   *   (n  +   1 )/2;
        System.out.println("SumOfnNaturalNumber:"+sum);
        sc.close();

    }
}
