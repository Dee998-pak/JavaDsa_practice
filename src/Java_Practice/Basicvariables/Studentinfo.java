package Java_Practice.Basicvariables;

public class Studentinfo {

   static String name =   "Deepak Kumar Behera";
   static  int age     = 27;
   static String university =   "Centurion University";
   static String Course   =   "mca";
   static String section  =   "C";
   static double cgpa =   8.6;
   static boolean  Exam   =   true;

    public static void main(String[] args){
                String RESET = "\u001B[0m";
                String GREEN = "\u001B[32m";
                String BLUE = "\u001B[34m";
                String YELLOW = "\u001B[33m";
                String CYAN = "\u001B[36m";
                String RED = "\u001B[31m";
                String PINK = "\u001B[95m";
                String PURPLE = "\u001B[35m";

        System.out.println(CYAN + "================================ " + RESET);
        System.out.println(YELLOW + "      STUDENT INFORMATION" + RESET);
        System.out.println(CYAN + "================================" + RESET);


        System.out.println(GREEN + "Student Name:" + RESET +name);
        System.out.println(BLUE + "Age:" + RESET +age);
        System.out.println(CYAN + "University:" + RESET +university);
        System.out.println(YELLOW + "COURSE:" +RESET + Course);
        System.out.println(RED +"SECTION:" +RESET + section);
        System.out.println(PINK +"CGPA:" + RESET + cgpa);
        System.out.println(PURPLE +"EXAM:" +RESET + Exam);


    }



}
