package JavaPractice.Basicvariables;

public class Approach2iV {
    String name;
    int age;
    String address;
    String course;

    void display(){
         System.out.println("Name:"+name);
         System.out.println("Age:"+age);
         System.out.println("Address:"+address);
         System.out.println("Course:"+course);
     }
     public static void main(String[]args){
        Approach2iV Ap = new Approach2iV();
        Ap.name ="Deepak kumar Behera";
        Ap.age =27;
        Ap.address="Jagatsinghpur";
        Ap.course ="MCA";

        Ap.display();
     }
}