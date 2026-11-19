package JavaPractice.Operators;

import java.util.Scanner;

public class sumexample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number");
        int n   =   sc.nextInt();

        int result  = n*(n+1)/2;
        System.out.println("The Sum N natural Number:"+result);
        sc.close();
    }
}
