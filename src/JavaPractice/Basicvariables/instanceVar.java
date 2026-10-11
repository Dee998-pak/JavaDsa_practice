package JavaPractice.Basicvariables;
public class instanceVar {
//    instance here i declares variables inside class but outsides methods/block/constructor.
    String name;
    int     age;
    char    gender;
    long    cell;
    String  address;

    public static void main(String args[]){
        instanceVar iv = new instanceVar();
        iv.name =   "Deepak";
        iv.age  =   27;
        iv.gender= 'M';
        iv.cell =   35647748l;
        iv.address="Badabuda";


        System.out.println("Name:"+iv.name);
        System.out.println("Age:"+iv.age);
        System.out.println("gender:"+iv.gender);
        System.out.println("cell:"+iv.cell);
        System.out.println("Address:"+iv.address);
    }
}
