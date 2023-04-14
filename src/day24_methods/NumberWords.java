package day24_methods;

public class NumberWords {

    public static void main(String[] args) {
        int numWords = numOfWords("Today is Saturday. It is a Java class day.");

        System.out.println("The total number is even: " + everOrOddWords(numWords));

    }

    public static int numOfWords (String sentence) {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {

            if (' ' == sentence.charAt(i)) {
                count++;   // 1
            }
        }


        return count+1;
    }

    public static boolean everOrOddWords (int num) {

        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }

       // return num % 2 == 0 ? true : false;
    }



}
