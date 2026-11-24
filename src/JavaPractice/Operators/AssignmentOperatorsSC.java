package JavaPractice.Operators;

import java.util.Scanner;

public class AssignmentOperatorsSC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number:");
        int x   =   sc.nextInt();

        x   +=  3;
        x   -=  5;
        x   *=  6;
        x   /=  9;

        System.out.println("Final value Of x:"+x);
        sc.close();
    }
}
