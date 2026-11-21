package JavaPractice.Operators;

import java.util.Scanner;

public class dayex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Todays day Number:");
        int t   =   sc.nextInt();

        System.out.println("Enter day Before:");
        int d   =   sc.nextInt();

        int previousday =  (t   -   d   +   7)%7;
        System.out.println("Day Before :"+previousday);
        sc.close();
    }
}
