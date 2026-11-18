package JavaPractice.Operators;

import java.util.Scanner;

public class Weekex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter todays day number:");
        int today   =   sc.nextInt();

        System.out.println("Enter Number Of Days Before:");
        int n   =   sc.nextInt();

        int previousdays    =   (today  -   n   +   7)  %   7;
        System.out.println("previous days:"+previousdays);
        sc.close();
    }
}
