package JavaPractice.Datatypes;

import java.util.Scanner;

public class CharacterValue {
    public static void main(StringType[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter One character:");

//        String name     = sc.nextLine();
        char ch =   sc.next().charAt(0);



        System.out.println("characters:"+ch);
        System.out.println("unicode evalue:"+(int)ch);
        System.out.println("its next character:"+(char)(ch+1));
        System.out.println("its previous character:"+(char)(ch-1));

    }
}
