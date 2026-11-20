package JavaPractice.Operators;

import java.util.Scanner;

public class EightdayBeforeFriday {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Todays Day Number:");
        int t   =   sc.nextInt();

        System.out.println("Enter Day Before:");
        int n   =   sc.nextInt();

        int previousday =   (t   -   n   +   7) %   7;
        System.out.println("EightdayBeforeFriday:"+previousday);
        sc.close();
    }
}
