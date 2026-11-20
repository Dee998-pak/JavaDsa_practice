package JavaPractice.Operators;

import java.util.Scanner;

public class bitwisenotexample2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number:");
        int a   =   sc.nextInt();

        int result  =   ~a;
        System.out.println("The Complement Of Number:"+result);
        sc.close();
    }
}
