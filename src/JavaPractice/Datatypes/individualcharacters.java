package JavaPractice.Datatypes;

import JavaPractice.Basicvariables.AgeProgram;

public class individualcharacters {
    public static void main(String[]args){
        String  st =    "Due to heavy rain our english   class is cancelled";
        System.out.println(st.length());
        System.out.println(st.charAt(0));
        System.out.println(st.charAt(2));
        System.out.println(st.charAt(3));
        System.out.println(st.charAt(4));
        System.out.println(st.charAt(5));
        System.out.println(st.charAt(6));
        System.out.println(st.charAt(8));
        System.out.println(st.charAt(7));

//        System.out.println(st.charAt(51));

        for (int i = 0;i < st.length();i++){
            System.out.println(st.charAt(i));

        }

//        Concatenating Strings

        String  s   =   "Deepak";
        String  s1  =   "Behera";
        String  rs  =   s+" "+s1;
        System.out.println(rs);

//        String + number


        int Age         =   26;
        String  S       =   "Deepak:"+Age;
        System.out.println("Deepak:"+Age);

//        Strings are immutable

        String  S2  =   "Hello Cutm";
        S2.concat("WELCOME");
        System.out.println("It Show Strings Are Immutable i;e, Before   :"+S2);

        S2= S2.concat(" WELCOME");
        System.out.println("After muttable:"+S2);


        String  sd  =   "Deepak";
        sd.concat("kumar Behera");
        System.out.println(sd);

        sd=sd.concat(" Kumar Behera");
        System.out.println(sd);

    }
}
