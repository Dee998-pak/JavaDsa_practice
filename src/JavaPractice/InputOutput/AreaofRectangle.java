package JavaPractice.InputOutput;

import java.util.Scanner;

public class AreaofRectangle {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Length Of Rectangle:");
        int length  =   sc.nextInt();
        System.out.println("The length Becomes:"+length);

        System.out.println("Enter Breadth Of Rectangle:");
        int breadth =   sc.nextInt();
        System.out.println("The Breadth Of Rectangle:"+breadth);

        int Area    =   length*breadth;
        System.out.println("Area Of Rectangle:"+Area);
        sc.close();
    }
}
