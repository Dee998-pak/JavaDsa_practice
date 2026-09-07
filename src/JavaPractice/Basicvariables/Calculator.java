package JavaPractice.Basicvariables;

public class Calculator {

    int add(int a,int b){
        return a+ b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }
   public static void main(String[] args){
        Calculator c = new Calculator();
        c.add(89,78);
        c.add(5,8,9);

       System.out.println("Add  of two becomes:"+c.add(89,78));
       System.out.println("Add of three becomes :"+c.add(5,8,9));

   }

}
