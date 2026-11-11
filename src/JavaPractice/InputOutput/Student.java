package JavaPractice.InputOutput;

import java.util.Scanner;

public class Student {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String  s;
        int     i;
        long    l;
        char    c;
        float   f;
        String  s1;
        String  s2;

        System.out.println("Enter Your Name:");
        s   =  sc.nextLine();

        System.out.println("Enter Your Age:");
        i   =   sc.nextInt();

        System.out.println("Enetr your regdNo.:");
        l   =   sc.nextLong();

        System.out.println("Enter Your grade:");
        c   =   sc.next().charAt(0);

        System.out.println("Enter your cgpa:");
        f   =   sc.nextFloat();
        sc.nextLine();
        System.out.println("Enter Your University Name:");
        s1  =   sc.nextLine();

        System.out.println("Enter your Address Name:");
        s2  =   sc.nextLine();

        System.out.println("Your name:"+s);
        System.out.println("your Age:"+i);
        System.out.println("your RegdNo:"+l);
        System.out.println("your cgpa:"+f);
        System.out.println("Your university Name:"+s1);
        System.out.println("Your Address Name:"+s2);

        sc.close();
    }
}
