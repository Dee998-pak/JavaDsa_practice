package JavaPractice.InputOutput;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The First Number:");
        int i   =   sc.nextInt();

        System.out.println("Enter The Second Number:");
        int i1  =   sc.nextInt();

        System.out.println("Enter The Third Number:");
        int i2  =   sc.nextInt();

        int avg =   i+i1+i2;

        System.out.println("First Number:"+i);
        System.out.println("The Second Number:"+i1);
        System.out.println("The Third Number:"+i2);

        System.out.println("The Avg Of Three Number:"+avg);
        sc.close();

    }
}
