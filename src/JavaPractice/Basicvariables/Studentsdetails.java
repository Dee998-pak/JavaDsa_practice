package JavaPractice.Basicvariables;

public class Studentsdetails {


    String name  =   "Deepak Kumar behera";
    int age =   27;
    String city =   "Paradip";
            public static void main(String[]args){


        //        System.out.println("Name:"+name);
        //        System.out.println("Age:"+age);
        //        System.out.println("City:"+city);

                Studentsdetails sd = new Studentsdetails();
                sd=new Studentsdetails();

                    sd.name();
                    sd.age();
                    sd.city();

        

    }

                private void city() {
                    System.out.println("City:"+city);
                }

                private void age() {
                    System.out.println("Age:"+age);
                }

                private void name() {
                    System.out.println("Name:"+name);
                }
}
