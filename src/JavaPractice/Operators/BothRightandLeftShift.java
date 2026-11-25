package JavaPractice.Operators;

import java.util.Scanner;

public class BothRightandLeftShift {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number:");
        int i   =   sc.nextInt();

        System.out.println("Enter The Number:");
        int j   =   sc.nextInt();

        int result  =   i   >>  j   ;
        int result1 =   i   <<  j   ;

        System.out.println("The Result Of BothRightandLeftShift:"+result    +   "  "   +    result1);
        sc.close();
    }
}
