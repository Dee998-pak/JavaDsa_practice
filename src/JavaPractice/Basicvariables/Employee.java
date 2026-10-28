package JavaPractice.Basicvariables;

public class Employee {
    String name ;
    int    salary;

    public static void main(String args[]){
        Employee emp =  new Employee();
        emp.name    =   "sarana";
        emp.salary  = 2000000;

        System.out.println("Employe nmae:"+emp.name);
        System.out.println("Salary Becomes:"+emp.salary);
    }
}
