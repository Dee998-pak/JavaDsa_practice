package JavaPractice.Datatypes;

public class ComparisionString {
 public static void main(String[] args){
     String s   = "Hello";
     String s1  = new String("Hello");
     System.out.println(s   ==  s1);
     System.out.println(s.equals(s1));
     System.out.println();
//     CaseSensitiveString

     String St  =   "deepak kumar behera";
     String St1 =   "DEEPAK KUMAR BEHERA";
     System.out.println(St==St1);
//     System.out.println(St.equalsIgnoreCase(St1));
 }
}
