package JavaPractice.InputOutput;
import  java.util.Scanner;

public class NameAge {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        String  s;
        int     i;

        System.out.println("Enter your Name:");
        s=sc.nextLine();

        System.out.println("Enter your Age:");
        i=sc.nextInt();

        System.out.println("Your name:"+s);

        System.out.println("Your Age:"+i);
        sc.close();
    }
}
