package day20_nested_loops;

import java.util.Scanner;

/*
    similar to fizzbuzz

    number
        % 3 --> fin
        % 5 --> ra
        both --> finra
        neither --> number

    repeated up to some number


Ask a user to enter a number

check all the number up to the number user gave us to see which is fin which ra or which finra
 */
public class FinRaInRange {

    public static void main(String[] args) {

        int num = 5;    // 1, 2, 3, 4, 5,
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check each up to that number: ");
        int userNum = input.nextInt();

        for (int i = 1; i <= userNum; i++) {  //10
            String str = "";

            if (i % 3 == 0) {                //
                str+= "FIN";
            }

            if (i % 5 == 0) {               //RA
                str += "RA";
            }

//
//            if (str.isEmpty()) {
//                System.out.println(i);
//            } else {
//                System.out.println(str + " ");   // 1, 2, 3, 4, 5
//            }


            System.out.println(str.isEmpty() ? i : str  );
            //                 boolean       ? true : false

        }



    }

}
