package JavaPractice.Operators;

import java.util.Scanner;

public class bitwiseORex {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number:");
        int x   =   sc.nextInt();

        System.out.println("Enter Second Number:");
        int y   =   sc.nextInt();

        int bitwiseor   =   x   |   y;
        System.out.println("BitWiseOr:"+bitwiseor);
        sc.close();
    }
}
