package JavaPractice.FlowControl;

import java.util.Scanner;

public class studentsmarksTUI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Mark:");
        int mrk =   sc.nextInt();

        if (mrk >=  40){
            System.out.println("The Student Become Pass");
        }
        else {
            System.out.println("The Student Become Fail");
        }
        sc.close();
    }
}
