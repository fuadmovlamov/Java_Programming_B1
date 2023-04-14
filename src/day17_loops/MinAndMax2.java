package day17_loops;

import java.util.Scanner;

public class MinAndMax2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int max = 0;                // int max = -279....... ;
//        int min = 9999999;        // int min =  279....... ;


//        int max = Integer.MIN_VALUE;                // int max = -279....... ;
//        int min = Integer.MAX_VALUE;                // int min =  279....... ;

        int max = -2147483648;                // int max = -279....... ;
        int min = 2147483647;                // int min =  279....... ;


        System.out.println(max);
        System.out.println(min);


        int count = 1;

        while (count <= 5) {
            System.out.println("Enter a number ");
            int num = input.nextInt();   // 5

            if (max < num ) {
                max = num;
            }


            if (min > num) {
                min = num;
            }

            count++;
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);


    }

}
