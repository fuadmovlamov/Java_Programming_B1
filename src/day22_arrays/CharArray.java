package day22_arrays;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {

        String [] letters = {"l", "o", "o", "p"};
        System.out.println(Arrays.toString(letters));


        String word = "loop";
        // toCharArray();
        char [] convertedWord = word.toCharArray();   // ['l', 'o', 'o', 'p']
        System.out.println(Arrays.toString(convertedWord));
        System.out.println(convertedWord[0]);
        System.out.println(convertedWord[1]);
        System.out.println(convertedWord[2]);
        System.out.println(convertedWord[3]);

        System.out.println("-----");
        for (char eachCharacter : convertedWord) {
            System.out.println(eachCharacter);
        }


        String days = "Monday - Sunday";
        //             012345.........
        char [] allLetters = days.toCharArray();
        System.out.println(allLetters[6]);
        System.out.println(Arrays.toString(allLetters));










    }
}
