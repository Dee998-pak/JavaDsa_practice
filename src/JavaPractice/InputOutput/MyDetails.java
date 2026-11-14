package JavaPractice.InputOutput;

import java.util.Scanner;

public class MyDetails {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name:");
        String  s   =   sc.nextLine();
        System.out.println("My Name Is:"+s);

        System.out.println("Enter Your Roll Number:");
        long    l   = sc.nextLong();
        System.out.println("This Is My RegdNo.:"+l);

        System.out.println("Enter Your Age:");
        int i   =   sc.nextInt();
        System.out.println("Age Becomes:"+i);

        System.out.println("Enter Your Cgpa:");
        float   f   = sc.nextFloat();
        System.out.println("This is My Curent Cgpa:"+f);

        System.out.println("Enter your Percentages:");
        float   f1  = sc.nextFloat();
        System.out.println("My Current Percentage:"+f1);

        sc.close();
    }
}
