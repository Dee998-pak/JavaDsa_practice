package JavaPractice.FlowControl;

import java.util.Scanner;

public class CheckDivisibilityby10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number:");
        int N   =   sc.nextInt();

        if (N%10==0){
            System.out.println("Divisible by 10");
        }
        else {
            System.out.println("");
        }
    }
}
