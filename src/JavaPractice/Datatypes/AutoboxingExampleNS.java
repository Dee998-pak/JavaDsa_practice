package JavaPractice.Datatypes;

public class AutoboxingExampleNS {
    void convertInt(){
        int a   =   11;
        Integer Z   =   a;
        System.out.println("This is Autoboxing But non-static method so here java creates an obj.Then call the method:"+Z);
    }
    public static void main(String[] args){
        AutoboxingExampleNS AB = new  AutoboxingExampleNS();
        AB.convertInt();

    }
}
