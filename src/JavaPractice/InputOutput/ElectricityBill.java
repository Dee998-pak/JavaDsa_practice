package JavaPractice.InputOutput;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Units:");
        int unit    =   sc.nextInt();

        System.out.println("Enter Price per unit");
        int unit1   =   sc.nextInt();

        System.out.println("Enter Addtional charges:");
        int Adc =   sc.nextInt();

        double  totalbill  =   (unit+unit1)*Adc;
        System.out.println("total electricity bill.="+totalbill);
        sc.close();
    }
}
