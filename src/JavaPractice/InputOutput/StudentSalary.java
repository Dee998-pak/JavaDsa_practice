package JavaPractice.InputOutput;

import java.util.Scanner;

public class StudentSalary {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter Basic Salary:");
        double  basic   = sc.nextDouble();

        System.out.println("Enter HRA:");
        double  HRA =   sc.nextDouble();

        System.out.println("Enter DA:");
        double da   =   sc.nextDouble();

        double  totalSalary =   basic+HRA+da;
        System.out.println("Total Salary:"+totalSalary);
        sc.close();
    }
}
