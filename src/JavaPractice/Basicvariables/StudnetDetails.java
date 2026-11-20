package JavaPractice.Basicvariables;

public class StudnetDetails {

    String  name;
    int     Age ;
    char    Gender;
    float   cgpa;

    public  static void main(String[] args){
        StudnetDetails  SD  =   new StudnetDetails();
        SD.name =   "Deepak Kumar Behera";
        SD.Age  =   27;
        SD.Gender='M';
        SD.cgpa=7.9f;

        System.out.println("Name:"+SD.name);
        System.out.println("Age:"+SD.Age);
        System.out.println("Gender:"+SD.Gender);
        System.out.println("Cgpa:"+SD.cgpa);
    }
}
