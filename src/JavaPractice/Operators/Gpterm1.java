package JavaPractice.Operators;

import java.util.Scanner;

public class Gpterm1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The First Term:");
        int a   =   sc.nextInt();

        System.out.println("Enter The Common Ratio:");
        int r   =   sc.nextInt();

        System.out.println("Enter The nth Term:");
        int n   =   sc.nextInt();

        int GP  =   (int)(a*Math.pow(r,n-1));
        System.out.println("Gp:"+GP);
        sc.close();
    }
}
