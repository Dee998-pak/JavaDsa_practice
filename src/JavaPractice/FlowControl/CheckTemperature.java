package JavaPractice.FlowControl;

import java.util.Scanner;

public class CheckTemperature {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Temperature:");
        int T   =sc.nextInt();

        if ( T>30){
            System.out.println("Hot");
        }
        else {
            System.out.println("Normal Temperature");
        }
        sc.close();
    }
}
