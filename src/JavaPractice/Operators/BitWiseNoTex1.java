package JavaPractice.Operators;

import java.util.Scanner;

public class BitWiseNoTex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number:");
        int x   =   sc.nextInt();

        int result  =   ~x;

        System.out.println("The Complement Of Number:"+result);
        sc.close();
    }
}
