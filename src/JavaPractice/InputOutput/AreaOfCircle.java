package JavaPractice.InputOutput;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius:");
        double r   =   sc.nextInt();

        double  area    =   (3.14)*r*r;
        System.out.println("Area of Circle Becomes:"+area);
        sc.close();
    }
}
