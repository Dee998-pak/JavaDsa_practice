package JavaPractice.FlowControl;

import java.util.Scanner;

public class FindTheGreaterNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number:");
        int a   =   sc.nextInt();

        System.out.println("Enter The Number:");
        int b   =   sc.nextInt();

        if (a   >   b){
            System.out.println("A is greater");
        }
        else {
            System.out.println("B is Greater");
        }
        sc.close();
    }
}
