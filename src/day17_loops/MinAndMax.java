package day17_loops;
    /*
    write a program that asks user to enter 5 numbers and returns the biggest and smallest numbers from those 5
     */

    /*
        repeated steps:

            ask for a number

            check is it the biggest

            check is it the smallest


     */

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int count = 1;

//        int smallest = Integer.MIN_VALUE;
//        System.out.println(smallest);
//        int biggest =Integer.MAX_VALUE;





        System.out.println("Enter a number");
        int num = input.nextInt();  // 3        5

        int smallest = num;
        int biggest = num;

        //       1
        while ( count  <= 4 ) {

            System.out.println("Enter a number");


            if (num > smallest) {      // 3 > 3
                smallest = num;
            }

            if (num < biggest) {
                biggest = num;
            }


            count++;
        }

        System.out.println("My max number " + smallest);
        System.out.println("My min number " + biggest);



    }






}
