package JavaPractice.Basicvariables;

//    Static variables examples
public class Student1 {

    int age ;
    String name ;
    String  Regdno;
    int year;
    char Sec;
    static String College = "Centurion university Of Technology  And Management";


    public static void main(String[]args){

        Student1 s1  =   new Student1();
        s1.age  =   21;
        s1.name =   "Deepak";
        s1.Regdno   =   "250320100159L";
        s1.year =   2021;
        s1.Sec  =   'C';



        Student1 s2 =   new Student1();
        s2.age  =   24;
        s2.name=    "Aman";
        s2.Regdno   =   "250320100159L";
        s2.year =   2023;
        s2.Sec  =   'B';

        Student1 s3  =   new Student1();
        s3.age  =   25;
        s3.name =   "Aditya";
        s3.Regdno   =   "250320100152L";
        s3.year =   2027;
        s3.Sec  =   'A';

        Student1 s4 =   new Student1();
        s4.age= 23;
        s4.name =   "Aduitya";
        s4.Regdno   =   "250320100155L";
        s4.year =   2026;
        s4.Sec  =   'D';

        System.out.println("Name:"+s1.name);
        System.out.println("Age:"+s1.age);
        System.out.println("REGDNO:"+s1.Regdno);
        System.out.println("years:"+s1.Regdno);
        System.out.println("Section:"+s1.Sec);
        System.out.println("University Name:"+College);

        System.out.println();


        System.out.println("Name:"+s2.name);
        System.out.println("Age:"+s2.age);
        System.out.println("REGDNO:"+s2.Regdno);
        System.out.println("years:"+s2.Regdno);
        System.out.println("Section:"+s2.Sec);
        System.out.println("University Name:"+College);

        System.out.println();


        System.out.println("Name:"+s3.name);
        System.out.println("Age:"+s3.age);
        System.out.println("REGDNO:"+s3.Regdno);
        System.out.println("years:"+s3.Regdno);
        System.out.println("Section:"+s3.Sec);
        System.out.println("University Name:"+College);

        System.out.println();


        System.out.println("Name:"+s4.name);
        System.out.println("Age:"+s4.age);
        System.out.println("REGDNO:"+s4.Regdno);
        System.out.println("years:"+s4.Regdno);
        System.out.println("Section:"+s4.Sec);
        System.out.println("University Name:"+College);
    }


}
