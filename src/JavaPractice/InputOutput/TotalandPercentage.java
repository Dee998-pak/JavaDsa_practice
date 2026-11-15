package JavaPractice.InputOutput;

import java.util.Scanner;

public class TotalandPercentage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Physics mark:");
        int i   =   sc.nextInt();

        System.out.println("Enter Chemistry mark:");
        int i1  =   sc.nextInt();

        System.out.println("Enter Math Mark:");
        int i2  =   sc.nextInt();

        System.out.println("Enter Biology Mark:");
        int i3  =   sc.nextInt();

        System.out.println("Enter Economics mark:");
        int i4  =   sc.nextInt();

        System.out.println("Enter Geography Mark:");
        int i5  =   sc.nextInt();

        int Total   =   i+i1+i2+i3+i4+i5;
        double Average =   Total/6.0;

        double percentage  = (Total/600.0)*100;
        System.out.println("Total marks:"+Total);
        System.out.println("Average Mark:"+Average);
        System.out.println("Total Percentage Of Mark:"+percentage+"%");
        sc.close();
    }
}
