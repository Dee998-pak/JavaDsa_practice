package JavaPractice.FlowControl;

import java.util.Scanner;

public class CheckLastDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number:");
        int N   =   sc.nextInt();

        if (N%10==5){
            System.out.println("last Digit Is 5");
        }
        else {
            System.out.println("Last Digit Not 5");
        }
        sc.close();
    }
}
