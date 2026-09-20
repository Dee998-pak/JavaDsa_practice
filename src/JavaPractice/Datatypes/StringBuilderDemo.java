package JavaPractice.Datatypes;

public class StringBuilderDemo {

    public static void main(StringDemo[] args){
        StringBuilder sb =   new StringBuilder("JAVA");
        System.out.println("initial StringBuilder");
        sb.append(" IS AWESOME");
        sb.append(4.5f);
        System.out.println("After Append:"+sb);
        System.out.println("After Append:"+sb);
    }
}
