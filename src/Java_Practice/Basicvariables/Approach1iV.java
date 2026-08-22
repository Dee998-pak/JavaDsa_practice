package Java_Practice.Basicvariables;

public class Approach1iV {
//  Variables are declare inside class but outside method.

    String name;
    int age;
    String email;
    long phone;
    int regdno;
    String course;
    double cgpa;

    public static void main(String[] args) {
        Approach1iV IV = new Approach1iV();

        IV.name = "Deepak Kumar Behera";
        IV.age = 25;
        IV.phone = 7064455793L;
        IV.regdno = 159;
        IV.course = "Centurion University";
        IV.cgpa = 1.5;



        System.out.println("Name:"+IV.name);
        System.out.println("Age:"+IV.age);
        System.out.println("Email:"+IV.email);
        System.out.println("Phone:"+IV.phone);
        System.out.println("Regdno:"+IV.regdno);
        System.out.println("Course:"+IV.course);
        System.out.println("CGPA:"+IV.cgpa);

    }
}
