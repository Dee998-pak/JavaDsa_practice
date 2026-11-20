package JavaPractice.InputOutput;

import java.util.Scanner;

public class celcioustoFahrenheit {
    public  static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter The Temperature In Celcious:");
        double  temp    =   sc.nextDouble();

        double  Fahrenheit  =   (temp*9/5)+32;
        System.out.println("The Fahrenheit Temp.:"+Fahrenheit);
        sc.close();
    }
}
