package JavaPractice.Datatypes;

public class stringbuilderEx {
    public static void main (String[]args){
//        String sn = new String("Welcome to Odisha");
//        System.out.println("Initial:"+sn);
//
//        sn=sn.concat("c");
//        System.out.println("Afer Append:"+sn);

        StringBuilder sn =  new StringBuilder("Welcome to Odisha");
        System.out.println("Initial:"+sn);

        sn.append("Welcome to Odisha");
        System.out.println("After Append:"+sn);

        sn.insert(11," Deepak ");
        System.out.println("After Insert:"+sn);
    }
}
