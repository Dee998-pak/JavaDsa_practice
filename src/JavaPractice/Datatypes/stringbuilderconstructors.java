package JavaPractice.Datatypes;

public class stringbuilderconstructors {
    public static void main(String[]args){
        StringBuilder sb1   =   new StringBuilder();
        sb1.append("Hello Odisha");
        System.out.println("Sb1:"+sb1);

        StringBuilder sb2   =   new StringBuilder(60);
        sb2.append("an empty builder with a specified initial capacity. Of 60");
        System.out.println("Sb2:"+sb2);

        StringBuilder sb3   =   new StringBuilder("My father had Want to See me As A doctor");
        sb3.append("But Due to lack of Hardwork And misguidence I can't fulfill my father's dream Still my father Appreciate me to give NEET EXAM ");
        System.out.println("Sb3:"+sb3);

        CharSequence    cs ="Java seems more difficult to me ";
        StringBuilder sb4   =   new StringBuilder(cs);
        sb4.append("Still i never Stop to read it");
        System.out.println("Sb4:"+sb4);
    }
}
