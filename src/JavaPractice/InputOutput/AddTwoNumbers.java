package JavaPractice.InputOutput;
import java.util.Scanner;
public class AddTwoNumbers {
    public static void main(String[] args){
        Scanner sc =    new Scanner(System.in);

        System.out.println("Enter First Number:");
        int i   =   sc.nextInt();
        System.out.println("My First Number:"+i);

        System.out.println("Enter Second Number:");
        int i1  =   sc.nextInt();
        System.out.println("My Second Number:"+i1);

        int sum =   i   +   i1;
        System.out.println("The Sum Of Two Numbers Becomes:"+sum);

        sc.close();
    }
}
