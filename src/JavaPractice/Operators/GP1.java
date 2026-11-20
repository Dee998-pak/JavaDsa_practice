package JavaPractice.Operators;

import java.util.Scanner;

public class GP1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr the First Term:");
        int     a   =   sc.nextInt();

        System.out.println("Enter the Common ratio");
        int     r   =   sc.nextInt();

        System.out.println("Enter The Nth Term:");
        int     n   =   sc.nextInt();

        int  GP  =  (int)(a  *   Math.pow(r,n-1));
        System.out.println("The GP Becomes:"+GP);
        sc.close();
    }
}
