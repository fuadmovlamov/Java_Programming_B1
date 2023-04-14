package day16_loops;

public class IndexOfExample {

    public static void main(String[] args) {

        String str = "banana";  // .length(); --- >6
//                    012345

        System.out.println(str.length());
//        String firstChar = str.charAt(0);  // ---- >
        String firstChar = "" + str.charAt(0);
        System.out.println(firstChar);

        firstChar = str.substring(0, 1);   // reassigned
        System.out.println(firstChar);

        // get the last  character of the word
        String lastChar = "" + str.charAt(str.length()-1);
        System.out.println(lastChar);

        // how can I get the last index of "n"
        System.out.println(str.lastIndexOf("n")); // -- > 4





    }




}
