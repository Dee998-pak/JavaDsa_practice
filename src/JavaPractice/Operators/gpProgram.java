package JavaPractice.Operators;

import java.util.Scanner;

public class gpProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The first term:");
        int a   =   sc.nextInt();

        System.out.println("Enter Common Difference:");
        int r   =   sc.nextInt();

        System.out.println("Enter nth Term:");
        int n   =   sc.nextInt();

        int GeometricProgression    =   (int)(a*Math.pow(r,n-1));
        System.out.println("GeometricProgression:"+GeometricProgression);
        sc.close();
    }
}
