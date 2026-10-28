package JavaPractice.Datatypes;

public class swapNumberWTV {

    public static void main(String[] args){
        int a   =   30;
        int b   =   50;

        a   =   a   +   b;
        b   =   a   -   b;
        a   =   a   -   b;

        System.out.println("Before Swapping:"+"a:30,b:50");
        System.out.println("After Swapping:"+"a:50,b:30");
    }

}
