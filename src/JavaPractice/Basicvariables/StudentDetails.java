package JavaPractice.Basicvariables;

public class StudentDetails {
            int rollNo = 159;
            String firstName="Deepak Kumar";
            String lastName="Behera";
            int age=19;
            String gender="Male";
            String address="Balitutha";
            long mobile_number = 7064316373L;
            String email    =   "Deepakkbehera123@gmail.com";
            String course   =   "MCA";
            String university =   "Centurion University";



            public static void main(String[] args) {
                StudentDetails sd = new StudentDetails();
                sd = new StudentDetails();
                sd.rollNo = 159;
                sd.firstName = "Deepak Kumar";
                sd.lastName = "Behera";
                sd.age = 19;
                sd.gender = "Male";
                sd.address = "Balitutha";
                sd.mobile_number = 7064316373L;
                sd.email="Deepakkbehera123@gmail.com";
                sd.course="Centurion University";


                System.out.println("Roll number:"+sd.rollNo);
                System.out.println("first name:"+sd.firstName);
                System.out.println("last name:"+sd.lastName);
                System.out.println("Age:"+sd.age);
                System.out.println("Gender:"+sd.gender);
                System.out.println("Address:"+sd.address);
                System.out.println("Mobilenumber:"+sd.mobile_number);
                System.out.println("email:"+sd.email);
                System.out.println("Course:"+sd.course);
                System.out.println("University:"+sd.university);

            }
}
