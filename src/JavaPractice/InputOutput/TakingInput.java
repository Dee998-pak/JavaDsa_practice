package JavaPractice.InputOutput;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int n   =   sc.nextInt();
        System.out.println("The Number Becomes:"+n);
        sc.nextLine();
        System.out.println("Enetr my String:");
        String  s   =   sc.nextLine();
        System.out.println("The String Becomes:"+s);

        System.out.println("Enter My String:");
        String  s1  =   sc.nextLine();
        System.out.println("The Another String Becomes:"+s1);
        sc.close();
    }
}
