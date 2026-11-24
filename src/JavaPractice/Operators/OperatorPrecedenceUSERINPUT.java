package JavaPractice.Operators;

import java.util.Scanner;

public class OperatorPrecedenceUSERINPUT {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number:");
        int a   =   sc.nextInt();

        System.out.println("Enter The 2nd Number:");
        int b   =   sc.nextInt();

        System.out.println("Enter the 3rd Number:");
        int c   =   sc.nextInt();

        System.out.println("Enter The 4th Number:");
        int d   =   sc.nextInt();

        System.out.println("Enter The 5th Number:");
        int e   =   sc.nextInt();


        int result  =   a   +   b   *   c   /   d   -   e;

        System.out.println("The Final result becomes:"+result);
        sc.close();
    }
}
