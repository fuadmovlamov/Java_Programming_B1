package day15_string;

public class CharMethod {
    public static void main(String[] args) {

        String word = "loop";   // 4 characters
        //             0123
        //             1234 -- NOT VALID INDEX

        System.out.println(word.length());

        // a method which returns us a char on a given INDEX - .charAt(int);
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));

        //System.out.println(word.charAt(4));

        String longWord = "lsadkjhflakjsdhfaklsjdhflkajsdhfaklsjdfha"; // 41 character
        //                 0                                       40
        System.out.println(longWord.length()); // 41


        int lastIndex = longWord.length()-1; //
        System.out.println(longWord.charAt(lastIndex));


    }

}
