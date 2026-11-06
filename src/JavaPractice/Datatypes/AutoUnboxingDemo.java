package JavaPractice.Datatypes;

public class AutoUnboxingDemo {
    void convertInt(){
        int a   =   23;
        Integer b   =   a;
        System.out.println("Autoboxing:"+b);
    }
    void convertInteger(){
        Integer s   =   11;
        int q   =   s;
        System.out.println("Unboxing:"+q);
    }
    public static void  main(String args[]){
        AutoUnboxingDemo obj    =   new AutoUnboxingDemo();
        obj.convertInt();
        obj.convertInteger();
    }
}
