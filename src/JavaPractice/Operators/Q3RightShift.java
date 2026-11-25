package JavaPractice.Operators;
    import java.util.Scanner;
public class Q3RightShift {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr The Number:");
        int e   =   sc.nextInt();

        System.out.println("Enter The Number:");
        int f   =   sc.nextInt();

        int ans =   e   >>  f   ;

        System.out.println("RightShift:"+ans);
        sc.close();
    }
}
