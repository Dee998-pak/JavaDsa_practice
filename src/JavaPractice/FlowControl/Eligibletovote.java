package JavaPractice.FlowControl;

import java.util.Scanner;

public class Eligibletovote {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Age:");
        int age   =   sc.nextInt();

        if (age >=  20){
            System.out.println("Eligible To Vote");
        }
        else {
            System.out.println("Not Eligible To Vote");
        }
        sc.close();
    }
}
