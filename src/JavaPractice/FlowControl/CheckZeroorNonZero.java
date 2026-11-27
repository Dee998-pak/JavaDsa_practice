package JavaPractice.FlowControl;

import java.util.Scanner;

public class CheckZeroorNonZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr The Number:");
        int N   =   sc.nextInt();

        if (N==0){
            System.out.println("Zero");
        }
        else {
            System.out.println("Non-Zero");
        }
        sc.close();
    }
}
