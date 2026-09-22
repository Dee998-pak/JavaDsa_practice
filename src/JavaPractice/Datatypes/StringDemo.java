package JavaPractice.Datatypes;

public class StringDemo {
    public static void main(String[] args) {
        String name = "Deepak Kumar behera";
        String  name2    =   "Deepak Kumar behera";
        String name1 = "        Today, Ashis, Dada, and I were going to Bhubaneswar.        ";
        String name4    =   "           How do we create a String?          ";
        System.out.println(name);
        System.out.println(name1);
        System.out.println(name1.length());
        System.out.println(name1.charAt(0));
        System.out.println(name1.charAt(1));
        System.out.println(name1.charAt(2));
        System.out.println(name1.charAt(3));
        System.out.println(name1.charAt(4));
        System.out.println(name1.charAt(5));
        System.out.println(name1.charAt(6));
        System.out.println(name1.charAt(7));
        System.out.println(name1.charAt(8));
        System.out.println(name1.charAt(9));
        System.out.println(name1.charAt(10));
        System.out.println(name1.charAt(11));
        System.out.println(name1.charAt(12));
        System.out.println(name1.charAt(13));
        System.out.println(name1.charAt(30));
        System.out.println(name1.charAt(51));

        System.out.println(name1.toUpperCase());
        System.out.println(name.toUpperCase());
        System.out.println();
        System.out.println(name.toLowerCase());
        System.out.println(name1.toLowerCase());
        System.out.println();
        System.out.println(name1.contains("Bhubaneswar"));
        System.out.println(name.contains("delhi"));
        System.out.println(name1.concat("@makt building."));
        System.out.println();
        System.out.println(name.charAt(7));
        System.out.println();
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(8));
        System.out.println();
        System.out.println(name.substring(0,19));
        System.out.println(name1.equals(name2));
        System.out.println();
        System.out.println(name.indexOf(19));
        System.out.println(name2.replace("Deepak","sitansu"));
        System.out.println(name4.toLowerCase());
        System.out.println(name4.toUpperCase());
        System.out.println(name4.trim());
        System.out.println();

        String[]words   =   name.split(" ");
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);



    }
}
