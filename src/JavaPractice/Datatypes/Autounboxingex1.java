package JavaPractice.Datatypes;

public class Autounboxingex1 {
   static  void Autoboxing(){
        int a   =   10;
        Integer c = a;
        System.out.println("c:"+c);

        char c1 =    'A';
        Character c2 =  c1;
        System.out.println("c2:"+c2);

        float   f   =   7.61f;
        Float   F   =   f;
        System.out.println("F:"+F);

        double  d   =   56.77;
        Double  D   =   d;
        System.out.println("D:"+D);

        boolean w = true;
        Boolean q = w;
        System.out.println("q:"+q);

        long    l   =   706547883272l;
        Long    L   =   l;
        System.out.println("L:"+L);
    }
   static void Unboxing(){
        Integer I = 11;
        int     i = I;
        System.out.println("i:"+i);

        Character C = 'D';
        char    c3  =   C;
        System.out.println("c3:"+c3);

        Float   F   =   34.76f;
        float   f   =   F;
        System.out.println("f:"+f);

        Double D    =   57.88;
        double  d   =   D;
        System.out.println("d:"+d);

        Boolean B   =   true;
        boolean b   =   B;
        System.out.println("b:"+b);

        Long    L   =   23456789l;
        long    l   =   L;
        System.out.println("l:"+l);
    }

    public static void main (String[] args){
        Autoboxing();
        Unboxing();
    }
}
