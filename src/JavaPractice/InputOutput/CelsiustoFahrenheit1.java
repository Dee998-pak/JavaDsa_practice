package JavaPractice.InputOutput;

import java.util.Scanner;

public class CelsiustoFahrenheit1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Temperature:");
        double  temp    =   sc.nextDouble();

      double Fahrenheit   =   (temp*9/5)+32;

        System.out.println("Temperature in Fahrenheit:"+Fahrenheit);
        sc.close();

    }
}
