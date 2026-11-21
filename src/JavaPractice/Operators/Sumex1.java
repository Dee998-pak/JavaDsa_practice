package JavaPractice.Operators;

import java.util.Scanner;

public class Sumex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number:");
        int z   =   sc.nextInt();

        int result  =   z*(z+1)/2;
        System.out.println("Sum Of N Natural Number:"+result);
        sc.close();
    }
}
