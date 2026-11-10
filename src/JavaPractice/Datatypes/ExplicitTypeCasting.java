package JavaPractice.Datatypes;

public class ExplicitTypeCasting {
    public static void  main(String[] args){
        // 1. double to float
        double a = 10.5;
        float b = (float) a;
        System.out.println("double to float: " + b);

        // 2. double to long
        double c = 100.75;
        long d = (long) c;
        System.out.println("double to long: " + d);

        // 3. double to int
        double e = 50.99;
        int f = (int) e;
        System.out.println("double to int: " + f);

        // 4. float to long
        float g = 25.8f;
        long h = (long) g;
        System.out.println("float to long: " + h);

        // 5. float to int
        float i = 45.6f;
        int j = (int) i;
        System.out.println("float to int: " + j);

        // 6. long to int
        long k = 1000L;
        int l = (int) k;
        System.out.println("long to int: " + l);

        // 7. int to short
        int m = 100;
        short n = (short) m;
        System.out.println("int to short: " + n);

        // 8. short to byte
        short o = 50;
        byte p = (byte) o;
        System.out.println("short to byte: " + p);

        // 9. int to byte
        int q = 120;
        byte r = (byte) q;
        System.out.println("int to byte: " + r);

        // 10. char to byte
        char s = 'A';
        byte t = (byte) s;
        System.out.println("char to byte: " + t);

        // 11. char to short
        char u = 'B';
        short v = (short) u;
        System.out.println("char to short: " + v);

        // 12. int to char
        int w = 65;
        char x = (char) w;
        System.out.println("int to char: " + x);

        // 13. long to short
        long y = 200L;
        short z = (short) y;
        System.out.println("long to short: " + z);

        // 14. long to byte
        long aa = 100L;
        byte bb = (byte) aa;
        System.out.println("long to byte: " + bb);

        // 15. double to byte
        double cc = 25.5;
        byte dd = (byte) cc;
        System.out.println("double to byte: " + dd);
    }
}
