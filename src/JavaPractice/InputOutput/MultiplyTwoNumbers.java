package JavaPractice.InputOutput;

import java.util.Scanner;

public class MultiplyTwoNumbers {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Eneter The Number:");
        int i   =   sc.nextInt();
        System.out.println("First Number Is:"+i);

        System.out.println("Enter Second Number:");
        int i1  =   sc.nextInt();
        System.out.println("Second Number Is:"+i1);

        int mul =   i*i1;
        System.out.println("Multiplication of Two Number Becomes: "+mul);
        sc.close();
    }
}
