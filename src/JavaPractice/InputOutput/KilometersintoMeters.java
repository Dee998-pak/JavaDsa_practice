package JavaPractice.InputOutput;

import java.util.Scanner;

public class KilometersintoMeters {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Distance in KM:");
        double  km  =   sc.nextDouble();

        double meters = km*1000;
        System.out.println("Distance in meters:"+meters);
        sc.close();



    }
}
