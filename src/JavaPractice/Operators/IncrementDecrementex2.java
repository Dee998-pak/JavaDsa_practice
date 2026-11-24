package JavaPractice.Operators;

import java.util.Scanner;

public class IncrementDecrementex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int s   =   sc.nextInt();

        System.out.println("Postincrement:"+ s++);
        System.out.println("Preincrement:"+ ++s);
        System.out.println("Postdecrement:"+ s--);
        System.out.println("predecrement:"+ --s);
        sc.close();

    }
}
