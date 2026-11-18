package JavaPractice.Operators;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal:");
        int p   =   sc.nextInt();

        System.out.println("Enter Rate Of Intrest:");
        int r   =   sc.nextInt();

        System.out.println("Enter Time Period:");
        int t   =   sc.nextInt();

        double  SimpleIntrest  =   (p*t*r)/100;
        System.out.printf("%.4f",SimpleIntrest);
        sc.close();

    }
}
