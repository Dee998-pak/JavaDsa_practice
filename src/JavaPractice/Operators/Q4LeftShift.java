package JavaPractice.Operators;

import java.util.Scanner;

public class Q4LeftShift {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number :");
        int g   =   sc.nextInt();

        System.out.println("Enter The Number:");
        int h   =   sc.nextInt();

        int solution    =   g   <<  h   ;
        System.out.println("BitWiseLeftShift:"+solution);
        sc.close();
    }
}
