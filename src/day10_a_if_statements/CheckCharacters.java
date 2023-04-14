package day10_a_if_statements;

/*
    create a char variable with a letter
    find out if the letter is an upper case letter or lowercase letter

    Ex:

        'b'
        print out: lowercase

        'A'
        print out: Uppercase

 */


public class CheckCharacters {

    public static void main(String[] args) {

        char letter = '$';

        if (letter >= 65  && letter <=90) {
            System.out.println("Uppercase");
        }


        if (letter >= 'A' && letter <= 'Z') {
            System.out.println("Uppercase");
        } else {
            System.out.println("Lowercase");
        }


        if (letter >= 'A' && letter <= 'Z') {
            System.out.println("Uppercase");
        }

        if (letter >= 'a' && letter <= 'z'){
            System.out.println("Lowercase");
        } else {
            System.out.println("It is not letter");
        }



    }





}
