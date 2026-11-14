package JavaPractice.InputOutput;

import java.util.Scanner;

public class TypeConverson {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double  d  ;
        System.out.println("Enter A Double Number:");
        d=  sc.nextDouble();
        int x =   (int)d;
        System.out.println("The Integer Number Becomes:"+x);
        sc.close();
    }
}
