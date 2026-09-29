package JavaPractice.Datatypes;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String  sr  =   "Welcome to Jagatsinghpur";
        String  st  =   "Odisha's 100 coastal villages now Tsunami Ready under UNESCO-IOC programme";

        String s    =   "Deepak";
        String sn   =   "   DEEPAK   ";
        System.out.println("Enter name");
        String name =  sc.next();
        String[] Name   =   name.split(" ");
        for(String i: Name){
            System.out.println(i);
        }

        System.out.println(st.length());
        System.out.println(sr.length());
        System.out.println();

        System.out.println(st.charAt(45));
        System.out.println(sr.charAt(20));
        System.out.println();

        System.out.println(st.equals(sr));
        System.out.println(sr.equalsIgnoreCase(st));
        System.out.println();

        System.out.println(st.toLowerCase());
        System.out.println(st.toUpperCase());
        System.out.println(sr.toLowerCase());
        System.out.println(sr.toUpperCase());
        System.out.println();

        System.out.println(st.lastIndexOf(4,3));
        System.out.println(st.contains("Tsunami"));
        System.out.println(sr.startsWith("Welcome"));
        System.out.println(sr.endsWith("Jagatsinghpur"));
        System.out.println();

        System.out.println();
        System.out.println(sr.length());
        System.out.println(sr.charAt(2));
        System.out.println(st.charAt(46));
        System.out.println(st.charAt(0));
        System.out.println(st.charAt(2));
        System.out.println(st.charAt(1));
        System.out.println(st.charAt(4));
        System.out.println();
        System.out.println(s.equals(sn));
        System.out.println(s.equalsIgnoreCase(sn));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.contains("Dee"));
        System.out.println(s.concat(" Kumar"));
        System.out.println(sn.indexOf(0));
        System.out.println(sn.replace("DEEPAK","Dipu"));
        System.out.println(sn.trim());
    }
}
