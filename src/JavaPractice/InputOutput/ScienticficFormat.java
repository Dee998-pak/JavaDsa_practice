package JavaPractice.InputOutput;

import java.util.Scanner;

public class ScienticficFormat {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        double  d;

        System.out.println("Scientific format:");
        d=sc.nextDouble();
        System.out.printf("%.4e",d);
        sc.close();
    }
}
