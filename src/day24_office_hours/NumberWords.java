package day24_office_hours;


import java.util.Scanner;

/*
    Write a method that accepts a number between 1 and 10
    And it returns the number as a word.

    Ex:
        numWord (4);

        Four

 */
public class NumberWords {

    public static String numWord (int num) {  // 2

//        if (num == 1) {
//            return "One";
//        } else if (num == 2) {
//            return "Two";
//        }

        if (num > 10 || num < 1) {
//            System.out.println("Number is not in the range.");
            return "Number is not in the range.";
        }

        String [] words = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        //                   0      1       2        3        4     5        6       7        8      9
        return words [num-1];
    }


    public static void main(String[] args) {
        numWord(1);
        String result = numWord(2);

        System.out.println(numWord(1));
        System.out.println(result);


        System.out.println("----------");
        System.out.println(numWord(5));

        System.out.println(numWord(13));

        System.out.println("----------");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to get the word: " );
        int userNum = input.nextInt();
        System.out.println(numWord(userNum));
    }

}


