package JavaPractice.InputOutput;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your  First number:");
        int i   =   sc.nextInt();

        System.out.println("Enter Your Second number:");
        int i1  = sc.nextInt();

        System.out.println("Before Swapping:");
        System.out.println("i="+i);
        System.out.println("i1+"+i1);

        int temp=i;
        i       =   i1;
        i1      =   temp;

        System.out.println("After Swapping:");
        System.out.println("i="+i);
        System.out.println("i1="+i1);

        sc.close();


    }
}
