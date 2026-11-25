package JavaPractice.Operators;

import java.util.Scanner;

public class BothLeftandRightShift {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number:");
        int k   =   sc.nextInt();

        System.out.println("Enetr The Number:");
        int l   =   sc.nextInt();

        int ans1    =   k   <<  l   ;
        int ans2    =   k   >>  l   ;
        System.out.println("BothRightandLeftShift Result Becomes:"+ ans1    +   " " +   ans2);
        sc.close();
    }
}
