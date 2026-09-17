package JavaPractice.Datatypes;

public class Demo {
    public static void main(String[] args){
        String name1 =   "Hello";


        name1.concat("World");
        System.out.println("Before Assignment:"+name1);


        String name2= name1 .concat("World");
        System.out.println("After Assignment:"+name2);
    }
}
