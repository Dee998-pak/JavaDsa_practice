package JavaPractice.Datatypes;
import java.util.Scanner;

public class CharacterProgram {
    public static void main(String[] args){

           Scanner sc   =   new Scanner(System.in);

           System.out.print(" NTER YUOR NMAE:");
           String name = sc.nextLine();

           char ch  =   name.charAt(16);

          System.out.println("MY NAME IS :"+ch);



    }
}
