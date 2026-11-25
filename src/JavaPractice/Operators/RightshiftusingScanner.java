package JavaPractice.Operators;

import java.util.Scanner;

public class RightshiftusingScanner {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr The Number:");
        int r   =   sc.nextInt();

        System.out.println("Enter The number:");
        int s   =   sc.nextInt();

        int result  =   r   >>  s   ;
        System.out.println("Right shift using Scanner:"+result);
        sc.close();
    }
}
