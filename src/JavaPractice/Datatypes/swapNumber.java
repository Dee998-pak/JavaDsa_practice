package JavaPractice.Datatypes;

public class swapNumber {
    int a   ;
    int b   ;
    int temp;

    public static void main(String[] args){
        System.out.println("Before Swapping:"+"a=34,b=57");

        int a   =   34;
        int b   =   57;
        int temp;

        temp    =   a;
        a       =   b;
        b       =   temp;

        System.out.println("After swapping:"+"a=57,b=34");
    }
}
