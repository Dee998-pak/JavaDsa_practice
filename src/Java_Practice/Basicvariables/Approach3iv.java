//package Java_Practice.Basicvariables;
//
//public class Approach3iv {
//
//    String name;
//    int age;
//    String gender;
//    String City;
//    String email;
//    String course;
//    int year;
//    String Address;
//
//    Approach3iv(String n, int a, String g, String C, String e, String c, int yr, String A){
//        name = n;
//        age  = a;
//        gender = g;
//        City  = C;
//        email = e;
//        course = c;
//        year = yr;
//        Address = A;
//    }
//
//    public static void main(String[]args){
//        Approach3iv a = new Approach3iv("Deepak",21,"male","Kujang",
//                "Dipu@123","mca",20
////        Approach3iv b = new Approach3iv("dipu",20,"male","Paradip","dipu@234","bca",98,"jspur");
//
//        System.out.println(a.name+a.age+"a.gender"+"a.City"+"email"+"course"+23+"yuyurgf");
//
//    }
//
//
//}

package Java_Practice.Basicvariables;

public class Approach3iv {

    String name;
    int age;
    String gender;
    String City;
    String email;
    String course;
    int year;
    String Address;

    Approach3iv(String n, int a, String g, String C, String e, String c, int yr, String A) {
        name = n;
        age = a;
        gender = g;
        City = C;
        email = e;
        course = c;
        year = yr;
        Address = A;
    }

    public static void main(String[] args) {

        Approach3iv a = new Approach3iv(
                "Deepak", 21, "male", "Kujang",
                "Dipu@123", "mca", 20, "BDB"
        );

        Approach3iv b = new Approach3iv(
                "Rahul", 22, "male", "Paradip",
                "Rahul@123", "mca", 21, "Jspur"
        );

        Approach3iv c = new Approach3iv(
                "Priya", 20, "female", "Cuttack",
                "Priya@123", "bca", 20, "Cuttack"
        );

        Approach3iv d = new Approach3iv(
                "Neha", 23, "female", "Bhubaneswar",
                "Neha@123", "mca", 22, "Patia"
        );

        Approach3iv e = new Approach3iv(
                "Amit", 21, "male", "Puri",
                "Amit@123", "bca", 20, "Puri"
        );

        System.out.println(a.name + " " + a.age+" "+a.gender+" "+a.City+" "+ a.email+" "+a.course+" "+a.year+" "+a.Address);
        System.out.println(b.name + " " + b.age+" "+b.gender+" "+ b.City+" "+b.email+" "+b.course+" "+b.year+" "+b.Address);
        System.out.println(c.name + " " + c.age+" "+c.gender+" "+c.City+" "+c.email+" "+c.course+" "+c.year+" "+c.Address);
        System.out.println(d.name + " " + d.age+" "+d.gender+" "+d.City+" "+d.email+" "+d.course+" "+d.year+" "+d.Address);
        System.out.println(e.name + " " + e.age+" "+e.gender+" "+e.City+" "+e.email+" "+e.course+" "+e.year+" "+e.Address);
    }
}
