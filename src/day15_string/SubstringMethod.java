package day15_string;

public class SubstringMethod {

    public static void main(String[] args) {

        String str  = "Saturday";  //8 characters
        //             01234567


        System.out.println(str.substring(3));
        System.out.println(str.substring(6));
        System.out.println(str);


        System.out.println(str.substring(2, 5));
        System.out.println(str.substring(0, 5));

        System.out.println(str.substring(0, 5) + "day");
        System.out.println(str.substring(0, 5) + str.substring(5, 8));
        System.out.println(str.substring(0, 5) + str.substring(5));





    }

}
