package day17_loops;

public class CountLetters {
    public static void main(String[] args) {

        String word = "aabbcca";   // "loop is great. loop is amazing"
        //             01234..
        char letter = 'a';       // "loop"
        int countOfLetterA = 0;


        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == letter) {
                countOfLetterA++;
            }

        }

        System.out.println("Count of letter a is: " + countOfLetterA);

    }
}
