package JavaPractice.Datatypes;

public class StringMethod {
    public static void main(String[]args){
        String s =  "Where is my Advance java  Class now";
        String st = "Today our competitive coding class will cancell ";

        String s1   =   "Deepak";
        String s2   =   "DEEPAK";
        System.out.println(s.length());
        System.out.println(st.length());
        System.out.println(s.charAt(3));
        System.out.println(s.concat(" And also Angular."));
        System.out.println(s.equals(st));
        System.out.println(s.equalsIgnoreCase(st));
        System.out.println();
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(st.substring(5,24));
        System.out.println(s.substring(6));
        System.out.println(st.indexOf(3));
        System.out.println();
        System.out.println(st.toUpperCase());
        System.out.println(s.toUpperCase());
        System.out.println(st.contains("class"));
        System.out.println(st.contains("clases"));
        for (int i =0;i< st.length();i++){
            char c  =   st.charAt(i);
            System.out.println(c);
        }

    }
}