package JavaPractice.InputOutput;

import java.util.Scanner;

public class SimpleInterest {
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter Principal Amount:");
        int Principal   =   sc.nextInt();
        System.out.println("Principal Amount:"+Principal);

        System.out.println("Enter Time:");
        int time    =   sc.nextInt();
        System.out.println("The Time Is:"+time);

        System.out.println("Enter The Rate:");
        int rate    =   sc.nextInt();
        System.out.println("The Rate Becomes:");

        int si  =   Principal*time*rate/100;
        System.out.println("Simple Intrest(SI):"+si);

        sc.close();

    }
}
