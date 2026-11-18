package JavaPractice.Operators;

import java.util.Scanner;

public class twodaysbeforeSunday {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter todays day number:");
        int todays  = sc.nextInt();

        int previousday =   (todays-2+7)%7;

        System.out.println("2 days before sunday:"+previousday);
        sc.close();
    }
}
