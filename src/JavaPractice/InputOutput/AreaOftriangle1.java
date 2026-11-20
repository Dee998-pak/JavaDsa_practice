package JavaPractice.InputOutput;

import java.util.Scanner;

public class AreaOftriangle1 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter The Base");
        double  base    =   sc.nextDouble();

        System.out.println("Enter The Height:");
        double  Height  =   sc.nextDouble();

        double  Area    =   (0.5)*base*Height;
        System.out.println("Area Of Triangle:"+Area);
        sc.close();
    }
}
