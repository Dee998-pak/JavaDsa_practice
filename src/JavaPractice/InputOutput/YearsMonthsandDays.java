package JavaPractice.InputOutput;

import java.util.Scanner;

public class YearsMonthsandDays {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Days:");
        int d   =   sc.nextInt();

        int years = d / 365;
        int remainingDays = d % 365;
        int month   =   remainingDays/30;
        int days    =   remainingDays%30;

        System.out.println("year:"+years);
        System.out.println("Month:"+month);
        System.out.println("Days:"+days);
        sc.close();
    }
}

