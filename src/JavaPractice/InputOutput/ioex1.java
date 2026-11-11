package JavaPractice.InputOutput;
import java.util.Scanner;

public class ioex1 {
    public static void main(String[] args){
        Scanner sc =    new Scanner(System.in);
        int n   ;
        System.out.println("Enter a number:");
        n   =   sc.nextInt();
        System.out.println("your number is:"+n);
        sc.close();
    }
}
