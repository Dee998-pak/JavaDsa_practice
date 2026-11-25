package JavaPractice.Operators;

import java.util.Scanner;

public class ARightShift {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number:");
        int a   =   sc.nextInt();

        System.out.println("Enter Second Number:");
        int b   =   sc.nextInt();

        int rs1 =   a   >>  b   ;
        System.out.println(rs1);
        sc.close();
    }
}
