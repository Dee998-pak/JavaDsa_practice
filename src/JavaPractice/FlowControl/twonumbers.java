package JavaPractice.FlowControl;

import java.util.Scanner;

public class twonumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number:");
        int a   =   sc.nextInt();

        System.out.println("Enter The Number:");
        int b   =   sc.nextInt();

        if (a   ==  b){
            System.out.println("Numbers are Equal");
        }
        else {
            System.out.println("Numbers are Not Equal.");
        }
        sc.close();
    }
}
