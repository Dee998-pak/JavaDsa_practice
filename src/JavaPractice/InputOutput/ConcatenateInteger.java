package JavaPractice.InputOutput;

import java.util.Scanner;

public class ConcatenateInteger {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int n1;

        System.out.println("Enter First No.");
        n= sc.nextInt();

        System.out.println("Enter Second No.");
        n1=sc.nextInt();

        System.out.println(n+""+n1);
    }
}
