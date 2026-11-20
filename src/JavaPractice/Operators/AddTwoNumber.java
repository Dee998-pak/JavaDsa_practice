package JavaPractice.Operators;

import java.util.Scanner;

public class AddTwoNumber {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The First Number:");
        int a   =   sc.nextInt();

        System.out.println("Enter The Second Number:");
        int b   =   sc.nextInt();

        int Sum =   a   +   b   ;
        System.out.printf("Sum:"+"%d",Sum);
        sc.close();
    }
}
