package JavaPractice.Datatypes;

public class stringconstructors {
    public static void main(String[]args){
        String str1  = new String("Hello IntelliJ");
        System.out.println("String using new keyword:"+str1);

        char charArray[] =  {'D','e','e','p','a','k'};
        String str2 =   new String(charArray);
        System.out.println("Creating string from character array:"+str2);

        char byteArray []    =   {68,101,101,112,97,107};
        String  str3    =   new String(byteArray);
        System.out.println("Creating string from byte array:"+str3);
    }
}
