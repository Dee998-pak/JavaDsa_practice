package JavaPractice.InputOutput;

import java.util.Scanner;

public class NumberInDifferentFormats {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        double num  =   sc.nextDouble();

        System.out.printf("Normal format:%f%n",num);
        System.out.printf("Two Decimal Places:%.2f%n",num);
        System.out.printf("Four Decimal Places:%4f%n",num);
        System.out.printf("Scientific Format:%e%n",num);
        System.out.printf("Scientific 3 Decimal:%.3e%n",num);
        sc.close();
    }
}
