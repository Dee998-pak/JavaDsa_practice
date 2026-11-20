package JavaPractice.Operators;

import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The First term:");
        int     a   =   sc.nextInt();

        System.out.println("Enter The Common ratio:");
        int     r   =   sc.nextInt();

        System.out.println("Enter nth Term:");
        int     n   =   sc.nextInt();

        int Gp  =   (a  *Math.pow(r,n-1));
        System.out.println("The Geometric Progression:"+Gp);
        sc.close();
    }
}
