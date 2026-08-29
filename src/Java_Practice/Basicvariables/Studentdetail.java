package Java_Practice.Basicvariables;

public class Studentdetail {

    // Instance variables
    String name;
    int age;
    String course;
    double cgpa;
    char grade;
    boolean student;

    // Static variable - shared by all students
    static String university = "Centurion University";

    public static void main(String[] args) {

        String RESET  = "\u001B[0m";
        String RED    = "\u001B[31m";
        String GREEN  = "\u001B[32m";
        String YELLOW = "\u001B[33m";
        String BLUE   = "\u001B[34m";
        String PURPLE = "\u001B[35m";
        String CYAN   = "\u001B[36m";
        String WHITE  = "\u001B[37m";

        Studentdetail deepak = new Studentdetail();
        deepak.name = "Deepak";
        deepak.age = 23;
        deepak.course = "MCA";
        deepak.cgpa = 8.6;
        deepak.grade = 'A';
        deepak.student = true;


        Studentdetail rahul = new Studentdetail();
        rahul.name = "Rahul";
        rahul.age = 22;
        rahul.course = "MCA";
        rahul.cgpa = 8.2;
        rahul.grade = 'A';
        rahul.student = true;

        // Student 3 - Amrita
        Studentdetail amrita = new Studentdetail();
        amrita.name = "Amrita";
        amrita.age = 23;
        amrita.course = "MCA";
        amrita.cgpa = 8.8;
        amrita.grade = 'A';
        amrita.student = true;

        System.out.println(" ");

        Studentdetail priya = new Studentdetail();
        priya.name = "Priya";
        priya.age = 22;
        priya.course = "MCA";
        priya.cgpa = 8.4;
        priya.grade = 'A';
        priya.student = true;

        System.out.println(" ");
        
        System.out.println( CYAN+ " DEEPAK:" +RESET);
        System.out.println("Name    : " + deepak.name);
        System.out.println("Age     : " + deepak.age);
        System.out.println("College : " + university);
        System.out.println("Course  : " + deepak.course);
        System.out.println("CGPA    : " + deepak.cgpa);
        System.out.println("Grade   : " + deepak.grade);

        System.out.println(" ");

        System.out.println(PURPLE + "RAHUL:" +RESET);
        System.out.println("Name    : " + rahul.name);
        System.out.println("Age     : " + rahul.age);
        System.out.println("College : " + university);
        System.out.println("Course  : " + rahul.course);
        System.out.println("CGPA    : " + rahul.cgpa);
        System.out.println("Grade   : " + rahul.grade);

        System.out.println(" ");
      
        System.out.println(YELLOW + "AMRITA" + RESET);
        System.out.println("Name    : " + amrita.name);
        System.out.println("Age     : " + amrita.age);
        System.out.println("College : " + university);
        System.out.println("Course  : " + amrita.course);
        System.out.println("CGPA    : " + amrita.cgpa);
        System.out.println("Grade   : " + amrita.grade);

        System.out.println(" ");
        
        System.out.println(BLUE + "PRIYA" +RESET);
        System.out.println("Name    : " + priya.name);
        System.out.println("Age     : " + priya.age);
        System.out.println("College : " + university);
        System.out.println("Course  : " + priya.course);
        System.out.println("CGPA    : " + priya.cgpa);
        System.out.println("Grade   : " + priya.grade);
    }
}
