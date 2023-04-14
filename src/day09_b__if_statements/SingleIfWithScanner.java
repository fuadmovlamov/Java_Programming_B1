package day09_b__if_statements;

import java.util.Scanner;

public class SingleIfWithScanner {

    public static void main(String[] args) {

        //create a Scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Why are we studying Java? ");
        String answer = input.nextLine();

        System.out.println("Is Java fun (true or false)? ");
        boolean answer2 = input.nextBoolean();

        // On the text two if statements, both conditions are checked.
        if (answer2) {
            System.out.println("Feyruz is really happy");
        }

        if (!answer2) {
            System.out.println("Turn your camera on it time to be grilled");
        }


        // Here if the if condition is TRUE, the else part is skipped
        if (answer2) {
            System.out.println("Feyruz is really happy");
        }else {
            System.out.println("Turn your camera on it time to be grilled");
        }

    }

}
