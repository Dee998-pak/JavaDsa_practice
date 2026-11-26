package JavaPractice.FlowControl;

import java.util.Scanner;

public class greaterNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number:");
        int n   =   sc.nextInt();

        if (n>=100){
            System.out.println("Greater Number");
        }
        else {
            System.out.println("Not Greater");
        }
        sc.close();
    }
}
