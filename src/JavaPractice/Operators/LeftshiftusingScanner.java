package JavaPractice.Operators;

import java.util.Scanner;

public class LeftshiftusingScanner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int t   =   sc.nextInt();

        System.out.println("Enter The Number:");
        int u   =   sc.nextInt();

        int leftShift   =   t   <<  u;
        System.out.println("Left shift using Scanner:"+leftShift);
        sc.close();
    }
}
