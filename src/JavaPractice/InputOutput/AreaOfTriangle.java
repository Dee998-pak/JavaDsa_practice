package JavaPractice.InputOutput;

import java.awt.geom.Area;
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Base:");
        double  base    =   sc.nextDouble();

        System.out.print("Enter Height:");
        double  height  =   sc.nextDouble();

        double  Area    =   0.5*base*height;

        System.out.println("Area Of Triangle:"+Area);

        sc.close();
    }
}
