package day16_loops;

/*
    if the number of characters are even print the middle two

    If the number of characters are odd print the middle one

 */


public class MiddleChar {
    public static void main(String[] args) {

        String word = "California";  // 10 characters -- > length()
        //   index     0123456789

        System.out.println(word.substring(word.length()-3));

        boolean isEven = word.length()%2 == 0;

        if (isEven) {
            System.out.println(word.substring(word.length()/2-1, word.length()/2+1));  //
        } else {

            //"Californi";  // 9 characters
            // 012345678
            System.out.println(word.substring(word.length()/2, word.length()/2 +1));   // 9/2 = 4
            System.out.println(word.charAt(word.length()/2));  // this is also fine if it is a single character

        }

        word = "Califohellornia";
             // 012345678910......
        System.out.println(word.indexOf("hello"));  // 6

        System.out.println(word.indexOf("quiz"));   // -1



    }
}
