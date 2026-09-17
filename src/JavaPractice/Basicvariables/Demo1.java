package JavaPractice.Basicvariables;

import javax.naming.Name;
import java.beans.DesignMode;

public class Demo1 {

        String Name =   "Deepak Kumar Behera" ;

        int age =   34;

        String gender =   "Male";
//
        long phn   =  7064306973L;
//
        String email  =   "bdeepakkumar409@gmail.com";
//
        String  Course=   "MCA";
//
        String University =   "Centurion University";
//
        long   reg_no =   250320100159L;
//
        char    grade  =   'E';
//
        boolean isPassed  =   true;
//
        double  cgpa =   8.6;
//
        String Address =   "Balitutha";
//


    public static void main(String[] args){

        Demo1 dm      =   new Demo1();
        dm.Name       =   "Deepak Kumar Behera";
        dm.age        =   27;
        dm.gender     =    "male";
        dm.phn        =    7064306973L;
        dm.email      =    "bdeepakkumar409@gmail.com";
        dm.Course     =    "MCA";
        dm.University =    "Centurion University";
        dm.reg_no     =    250320100159L;
        dm.grade      =   'E';
        dm.isPassed   =    true;
        dm.cgpa       =    8.6;
        dm.Address    =   "Balitutha";


        System.out.println("NAME:"+dm.Name);
        System.out.println("Age:"+dm.age);
        System.out.println("Gender:"+dm.gender);
        System.out.println("PNo:"+dm.phn);
        System.out.println("email:"+dm.email);
        System.out.println("Course:"+dm.Course);
        System.out.println("UNIVERSITY:"+dm.University);
        System.out.println("REGD:"+dm.reg_no);
        System.out.println("Grade:"+dm.grade);
        System.out.println("is_passed:"+dm.isPassed);
        System.out.println("Cgpa:"+dm.cgpa);
        System.out.println("Adress:"+dm.Address);

    }
}
