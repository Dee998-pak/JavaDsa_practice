package JavaPractice.InputOutput;
import java.util.Scanner;
public class PersonalDetails {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name:");
        String  s   = sc.nextLine();
        System.out.println("Your Name Is:"+s);
        sc.nextLine();

        System.out.println("Enter Your Age:");
        int i   =   sc.nextInt();
        System.out.println("Your Age Become:"+i);
        sc.nextLine();
        System.out.println("Enter Your City:");
        String  s1  =   sc.nextLine();
        System.out.println("Your City Name Is:"+s1);
        sc.close();
    }
}
