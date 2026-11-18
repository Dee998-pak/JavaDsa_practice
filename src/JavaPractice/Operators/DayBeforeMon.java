package JavaPractice.Operators;

import java.util.Scanner;

public class DayBeforeMon {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter today's day number:");
        int today   =   sc.nextInt();

        int previousday =   (today - 1 + 7) % 7;
        System.out.println("Previous day:"+previousday);
        sc.close();
    }
}
