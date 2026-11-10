package JavaPractice.Datatypes;

public class wideningTypeconversion {
    public static void main(String[] args){
        int a = 65;
        char c  = (char)  a;

//       1. byte to short
            byte b  =   10;
            short s = b;
        System.out.println("byte to short: " + s);

//        2. byte to int
        byte    B   =   10;
        int     i   =   B;
        System.out.println("byte to int:"+i);

//        4. byte to float
        byte    v   =   23;
        float   g   =   v;
        System.out.println("byte to float:"+g);

//        6. short to int
        short   z   =   100;
        int     y   =   z;
        System.out.println("short to int:"+y);

//        7. short to long
        short   f   =   323;
        long    l   =   f;
        System.out.println("short to long:"+l);

//        8. short to float

        short   e   =   100;
        float   t   =   e;
        System.out.println("short to float:"+t);

//        9. short to double
        short q =   400;
        double  d   =   q;
        System.out.println("short to double");

//        10. char to int
        char    c1  =   'A';
        int     i1  =   c1;
        System.out.println("char to int:"+i1);

//        11. char to long
        char    h   =   'w';
        long    l1  =   h;
        System.out.println("char to long:"+l1);

//        12. char to float
        char    t1   =   'T';
        float   u   =   t1;
        System.out.println("char to float:"+u);

//       13. char to double
        char    p   =   'U';
        double  D   =   p;
        System.out.println("char to double:"+D);

//      14.  int to long
        int r   =   500;
        long    x   =   r;
        System.out.println("int to long:"+x);

//        15. int to float
        int f2   =   76;
        float   i3  =   f2;
        System.out.println("int to float:"+i3);

//       16. int to double
        int o   =   890;
        double  S   =   o;
        System.out.println("int to double:"+S);

//      17. long to float
        long    l2= 10000l;
        float   h2   =   l2;

//      18. long to double
        long    u1   =   900000l;
        double  g1    =  u1;
        System.out.println("long to double:"+g1);

//       19. float to double
        float   f3  =   7.91f;
        double  k   =   f3;
        System.out.println("float to double:"+k);


    }
}
