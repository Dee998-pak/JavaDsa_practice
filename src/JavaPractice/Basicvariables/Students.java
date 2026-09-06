package JavaPractice.Basicvariables;

public class Students {
    String name;
    int age;
    String firstName;
    String lastName;
    String city;
    String Course;

    public static void main(String[] args) {
       Students s1 = new  Students();
       Students s2 = new Students();
       Students s3 = new Students();

       s1.name="Deepak Kumar";
       s1.age=25;
       s1.firstName="Deepak Kumar";
       s1.lastName="Behera";
       s1.city="Deepak Kumar";
       s1.Course="Deepak Kumar";

       s2.name="Susant kumar Das";
       s2.age=26;
       s2.firstName="Susant kumar";
       s2.lastName="Das";
       s2.city="Susant kumar";
       s2.Course="Susant kumar";

       s3.name="Pradeep Kumar Jena";
       s3.age=27;
       s3.firstName="Pradeep Kumar";
       s3.lastName="Das";
       s3.city="Pradeep Kumar";
       s3.Course="Pradeep Kumar";


       System.out.println( "Name:"+s1.name);
       System.out.println( "Age:"+s1.age);
       System.out.println( "First Name:"+s1.firstName);
       System.out.println( "Last Name:"+s1.lastName);
       System.out.println( "City:"+s1.city);
       System.out.println( "Course:"+s1.Course);


       System.out.println( "Name:"+s2.name);
       System.out.println( "Age:"+s2.age);
       System.out.println( "First Name:"+s2.firstName);
       System.out.println( "Last Name:"+s2.lastName);
       System.out.println( "City:"+s2.city);
       System.out.println( "Course:"+s2.Course);

       System.out.println( "Name:"+s3.name);
       System.out.println( "Age:"+s3.age);
       System.out.println( "First Name:"+s3.firstName);
       System.out.println( "Last Name:"+s3.lastName);
       System.out.println("city:"+s3.city);
       System.out.println("course:"+s3.Course);


    }
}
