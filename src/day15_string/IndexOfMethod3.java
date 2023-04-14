package day15_string;

public class IndexOfMethod3 {
    public static void main(String[] args) {

        String str = "definition";  // 10 characters
        //            0123456789

        System.out.println("First index of i: " + str.indexOf("i"));       // 3
        System.out.println("Last index of i: " + str.lastIndexOf("i")); // 7

        //System.out.println("Last i: " + str.indexOf("i",7));

        int firstIindex = str.indexOf("i");
        System.out.println(str.indexOf("i", firstIindex+1));



    }
}
