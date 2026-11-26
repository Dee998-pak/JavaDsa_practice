package JavaPractice.FlowControl;

import java.util.Scanner;

public class personsageUsingScanner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age:");
        int age =   60;

        if (age>=60){
            System.out.println("citizen");
        }
        else {
            System.out.println("not Citizen");
        }
        sc.close();
    }
}
