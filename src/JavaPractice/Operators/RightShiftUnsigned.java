package JavaPractice.Operators;

import java.util.Scanner;

public class RightShiftUnsigned {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int s   =   sc.nextInt();

        int rs  =   s>>1;
        System.out.println("right UnsignedShift:"+rs);
        sc.close();
    }
}
