package day10_a_if_statements;

import java.util.Scanner;

/*
        declare and assign 3 int variables
        between the 3 numbers find the print the biggest one
 */
public class Biggest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter, 3 numbers. Use enter after each. ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();


        if (num1 >= num2 && num3 <= num1) {
            System.out.println(num1 + " is the biggest one");
        } else if (num2 > num1 && num2 >= num3) {
            System.out.println(num2 + " is the biggest one");
        } else {
            System.out.println(num3 + " is the biggest one");
        }



    }




}
