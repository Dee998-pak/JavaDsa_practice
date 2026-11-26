package JavaPractice.FlowControl;

import java.util.Scanner;

public class CheckpositiveornegativeEx1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number:");
        int n   =   sc.nextInt();

        if ( n  >=  0   ){
            System.out.println("Number Is positive");
        }
        else {
            System.out.println("Number Is Negative");
        }
        sc.close();
    }
}
