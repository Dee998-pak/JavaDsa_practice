package JavaPractice.InputOutput;

import java.util.Scanner;

public class PrintWithQuotes {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        String s;

        System.out.println("Enter a String:");
        s=sc.nextLine();
        System.out.println("My String Becomes:\""+s+"\"");
        sc.close();
    }
}
