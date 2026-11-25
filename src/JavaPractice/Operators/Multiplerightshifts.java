package JavaPractice.Operators;

import java.util.Scanner;

public class Multiplerightshifts {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number:");
        int x   =   sc.nextInt();


        int res =   x;

        System.out.println( res   >> 1);
        System.out.println( res   >> 2);
        System.out.println( res   >> 3);
        sc.close();
    }
}
