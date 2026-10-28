package JavaPractice.Basicvariables;

public class Student {
    int age ;
    char  gender;
    String  name;
    float   cgpa;
    double  salary;
    String  Address;
    String  Course;

    public static void main (String args[]){
       Student st = new Student();
       st.age       =   26;
       st.gender    =   'M';
       st.name      =   "Sitansu";
       st.cgpa      =   7.84f;
       st.salary    =   10000;
       st.Address   =   "Balitutha";
       st.Course    =   "Master Of Computer Applications";

        System.out.println("Age:"+st.age);
        System.out.println("Gender:"+st.gender);
        System.out.println("Address="+st.Address);
        System.out.println("Name:"+st.name);
        System.out.println("CGPA:"+st.cgpa);
        System.out.println("Salary:"+st.salary);
        System.out.println("COURSE:"+st.Course);

    }
}
