package day09_a__scanner;

 /*
    Write a program that asks the user to enter 3 angle numbers ( can be double numbers )
    Determine if the angles make a triangle, which means the angles add to 180.0
    and
    Determine if the angles make a circle, which means the angles add to 360.0
     */

import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {

        //Create a Scanner object
        Scanner input = new Scanner (System.in);

        //asks the user to enter 3 angle numbers
        System.out.println("Enter 3 angle numbers");
        double degreeOne = input.nextDouble(),  //300
                degreeTwo = input.nextDouble(),  //30
                degreeThree = input.nextDouble(); //30


        // for triangle --- > total degree of inner calculation is 180

        // Calculate what is the total of 3 numbers
        double total = degreeOne + degreeTwo + degreeThree;


        // Write a print statement that print if it is triangle.
        System.out.println("It is triangle: " + (total == 180) );

        // Write a print statement that print if it is circle.
        System.out.println("It is circle: " + (total == 360) );

        // Write a print statement that print if it is EITHER triangle or Circle
        System.out.println("It is either triangle or circle: " + (total == 180 || total == 360));



    }
}
