package JavaPractice.Datatypes;

public class Calculator {

    static final String RESET = "\u001B[0m";
    static final String RED = "\u001B[31m";
    static final String GREEN = "\u001B[32m";
    static final String YELLOW = "\u001B[33m";
    static final String BLUE = "\u001B[34m";
    static final String VIOLET = "\u001B[35m";

    public static void main(String[] args){
        int a   =   224;
        int b   =   22;


        int total   =   a   +   b;
        int avg     =   total/2;


        int sum =   a   +   b;
        int sub =   a   -   b;
        int mul =   a   *   b;
        int div =   a   /   b;
        int rem =   a   %   b;

        System.out.println("TOTAl:"+total);
        System.out.println("AVERAGE:"+avg);
        System.out.println();

        System.out.println(VIOLET+"================================CALCULATOR========================================="+RESET);
        System.out.println(GREEN+"SUM OF TWO NUMBERS:"+sum+RESET);
        System.out.println(RED+"DIFFERENCE OF TWO NUMBERS:"+sub+RESET);
        System.out.println(YELLOW+"MULTIPLICATIONS OF TWO NUMBERS:"+mul+RESET);
        System.out.println(BLUE+"DIVISIONS OF TWO NUMBERS:"+div+RESET);
        System.out.println(VIOLET+"REMAINDERS OF TWO NUMBERS:"+rem+RESET);


    }
}
