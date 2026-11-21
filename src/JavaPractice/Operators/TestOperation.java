package JavaPractice.Operators;

import java.util.Scanner;

public class TestOperation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The First Number:");
        int x   =   sc.nextInt();

        System.out.println("Enter the Second Number:");
        int y   =   sc.nextInt();

        int a   =   x+y;
        int s   =   x-y;
        int m   =   x*y;
        double  f   =(double)   x/y;
        int     d   =   x/y;
        int     md  =   x%y;

        System.out.printf("%d %d %d %.2f %d %d",a,s,m,f,d,md);
        sc.close();
    }
}
