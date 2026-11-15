package JavaPractice.InputOutput;

import java.awt.geom.Area;
import java.util.Scanner;

public class AreaofaCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius:");
        double  R  =   sc.nextDouble();

       Double Area    = (3.1415)*R*R;
        System.out.println("Area Of Circle:"+Area);
        sc.close();

    }
}
