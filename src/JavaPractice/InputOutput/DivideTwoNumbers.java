package JavaPractice.InputOutput;

import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number");
        int i   =   sc.nextInt();
        System.out.println("The First Number Is:"+i);

        System.out.println("Enter Second Number");
        int i1  =sc.nextInt();
        System.out.println("The Scecond Number Is:"+i1);

        int div =   i/i1;

        System.out.println("The Of Two Number Is :"+div);
        sc.close();
    }
}
