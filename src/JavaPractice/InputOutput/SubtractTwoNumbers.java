package JavaPractice.InputOutput;

import java.util.Scanner;

public class SubtractTwoNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number ");
        int i   =   sc.nextInt();
        System.out.println("This Is My First Number:"+i);

        System.out.println("Enter Second Number:");
        int i1  =   sc.nextInt();
        System.out.println("This Is My second Number:"+i1);

        int sub =   i-i1;
        System.out.println("So The Subtraction Of Two Number Becomes:"+sub  );
        sc.close();
    }
}
