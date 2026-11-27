package JavaPractice.FlowControl;

import java.util.Scanner;

public class NumberRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number:");
        int a   =   sc.nextInt();

        if (a>=50 &&a<=100){
            System.out.println("Number is in Range");
        }
        else {
            System.out.println("Number is Out of Range");
        }
        sc.close();
    }
}
