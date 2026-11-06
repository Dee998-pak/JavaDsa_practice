package JavaPractice.Datatypes;

public class AutoBoxingExample {
    static void convertInt(){
        int a   =   27;
        Integer b   =   a;
        System.out.println(" This Is Autoboxing so the value of b becomes:"+b);
    }
    public static void main(String[] args){
        convertInt();
    }
}
