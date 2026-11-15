package JavaPractice.InputOutput;

import java.util.Scanner;

public class CelsiustoFahrenheit {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Take temperature in Celsius:");
        int temp    =   sc.nextInt();
        System.out.println("temperature in Celsius:"+temp);

        double fahrenheit   =   (9.0/5.0)*temp+32;
        System.out.println("fahrenites:"+fahrenheit);
        sc.close();
    }
}
