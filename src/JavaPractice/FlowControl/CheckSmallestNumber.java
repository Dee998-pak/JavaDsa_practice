package JavaPractice.FlowControl;

import java.util.Scanner;

public class CheckSmallestNumber {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter The Number:");
            int a   =   sc.nextInt();

            System.out.println("Enter The Number:");
            int b   = sc.nextInt();

            if (a   <   b  ){
                System.out.println("A is smaller");
            } else if (b    <   a) {
                System.out.println("B is greater ");
            } else {
                System.out.println("Both Numbers are Equal");
            }
            sc.close();
        }
}
