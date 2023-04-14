package day17_loops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userNum  = input.nextInt();   // 5

        int numOfSum = 0;
        // 6 + 8  + -1


        // continue getting a number from user until it is negative number
        while (userNum >= 0) {

            numOfSum = numOfSum + userNum;   // numOfSum += num;
            System.out.println("Sum of the number so far: " + numOfSum);

            System.out.println("Enter number again: ");
            userNum = input.nextInt();

            if (userNum < 0) {
                System.out.println(userNum + " is a negative number. That is why the while loop ended.");
            }



        }















    }




}
