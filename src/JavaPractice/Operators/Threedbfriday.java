package JavaPractice.Operators;

import java.util.Scanner;

public class Threedbfriday {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Todays day Number:");
        int today   =   sc.nextInt();

        System.out.println("Enter number of days before:");
        int n   =   sc.nextInt();

        int previousday    =   (today-n+7)%7;

        System.out.println("previousday:"+previousday);
        sc.close();
    }
}
