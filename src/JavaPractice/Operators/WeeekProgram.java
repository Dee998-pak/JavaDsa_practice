package JavaPractice.Operators;

import java.util.Scanner;

public class WeeekProgram {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Todays Day Number:");
        int Today   =   sc.nextInt();

        System.out.println("Enter The Day Before:");
        int n   =   sc.nextInt();

        int previousDay =   (Today   -   1   +   7) %7;
        System.out.println("Previous Day:"+previousDay);
        sc.close();
    }
}
