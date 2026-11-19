package JavaPractice.Operators;

import java.util.Scanner;

public class Dayprogram {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Todays Day number:");
        int Today   =   sc.nextInt();

        System.out.println("Enter The day Before:");
        int n   =   sc.nextInt();

        int previousDay =   (Today  -   1   +7)%7;
        System.out.println("Three day Before friday:"+previousDay);
        sc.close();
    }
}
