package JavaPractice.Datatypes;

public class StringMethods {
    public static void main(String[] args){
        String  sr  =   "Welcome to Jagatsinghpur";
        String  st  =   "Odisha's 100 coastal villages now Tsunami Ready under UNESCO-IOC programme";

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





    }
}
