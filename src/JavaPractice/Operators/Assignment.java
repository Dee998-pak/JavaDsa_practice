package JavaPractice.Operators;

public class Assignment {
    public static void main(String[] args){
        int x=10,y=20,z,w=11;

        x   +=  y;
        System.out.println(x);

//        y   +=  x;
//        System.out.println(y);

        x   *=  y;
        System.out.println(x);

        x   %=  y;
        System.out.println(x);

        z   =   x   =  y;
        System.out.println(z);

        x   =   z   +   (y   *   w);
        System.out.println(x);
    }
}
