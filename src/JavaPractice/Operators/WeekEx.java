package JavaPractice.Operators;

import java.util.Scanner;

public class WeekEx {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Today day Number:");
        int today   =   sc.nextInt();

        System.out.println("Enter number of days Before: ");
        int n   =   sc.nextInt();

        int previousday =   (today  -   n   +   7)  %   7;

        System.out.println("previous day:"+previousday);
        sc.close();
    }
}
