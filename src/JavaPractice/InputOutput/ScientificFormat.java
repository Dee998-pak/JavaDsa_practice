package JavaPractice.InputOutput;

import java.util.Scanner;

public class ScientificFormat {
    public static void  main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter a double value:");
        double  d   =   sc.nextDouble();
        System.out.printf("Scientic format Becomes:%e",d);
        sc.close();
    }
}
