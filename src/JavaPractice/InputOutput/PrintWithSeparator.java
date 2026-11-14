package JavaPractice.InputOutput;

import java.util.Scanner;

public class PrintWithSeparator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String  s;
        String  s1;
        String  s2;

        System.out.println("Enter a String:");
        s=sc.nextLine();
        sc.nextLine();
        System.out.println("Enter Separator:");
        s1=sc.nextLine();

        System.out.println("Enetr a String:");
        s2=sc.nextLine();

        System.out.println(s+s1+s2);
        sc.close();
    }
}
