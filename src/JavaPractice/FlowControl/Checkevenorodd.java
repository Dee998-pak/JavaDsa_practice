package JavaPractice.FlowControl;

import java.util.Scanner;

public class Checkevenorodd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number:");
        int n   =   sc.nextInt();

        if (n   %   2   ==  0){
            System.out.println("The Number Is Even");
        }
        else {
            System.out.println("The Number Is Odd");
        }
        sc.close();
    }
}
