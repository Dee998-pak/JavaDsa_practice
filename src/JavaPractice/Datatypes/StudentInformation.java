package JavaPractice.Datatypes;

public class StudentInformation {
    public static void main(String[] args){
        String name     =   "Deepak Kumar Behera";

        int mark1       =   421;
        int mark2       =   339;
        int mark3       =   98;

        int Total   =   mark1+mark2+mark3;
        int avg =  Total /3;

        System.out.println("NAME:"+name);
        System.out.println("TOTAL MARK:"+Total);
        System.out.println("AVERAGE:"+avg);

    }
}
