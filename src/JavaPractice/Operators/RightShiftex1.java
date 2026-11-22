package JavaPractice.Operators;

import java.util.Scanner;

public class RightShiftex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number:");
        int x   = sc.nextInt();

        int rs  =   x<<1;

        System.out.println("RightShift:"+rs);
        sc.close();
    }
}
