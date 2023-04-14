package day21_arrays;

import java.util.Scanner;

/*

    Ask the user the month number they want, print the month name

    1 --> January

    12 --> December

    Assume only valid numbers are given, but as a challenge you can handle invalid numbers

 */
public class SelectMonth {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter which month number you want: ");
        int monthNum = input.nextInt();  // -1

        String [] allMonths = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    //                           0           1          2          3      4       5       6        7        8            9           10         11
        System.out.println("The number you entered represents this month: " + allMonths[monthNum - 1]);  // 12-1
                                                                //            allMonth [-1 - 1] -- > -2
    }


}
