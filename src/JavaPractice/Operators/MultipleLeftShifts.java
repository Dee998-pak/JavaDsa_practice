package JavaPractice.Operators;

import java.util.Scanner;

public class MultipleLeftShifts {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr The Number:");
        int y   =   sc.nextInt();

        int op1 =   y;

        System.out.println("Left Shifts by 1:"+(op1 <<1));
        System.out.println("Left Shifts by 2:"+(op1 <<2));
        System.out.println("Left Shifts by 3:"+(op1 <<3));
        sc.close();
    }
}
