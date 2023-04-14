package day20_nested_loops;

/*
    [IQ] Prime in range

    Given a number. Print out all the prime numbers from 2 to that number A prime number is a number that is only divisible by 1 and itself.

    Ex:
        Input:
            50 -- > 1 .....................................50
        Output:
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
 */

public class PrimInNumbers {
    public static void main(String[] args) {

        int num = 50;

        for (int i = 2; i <= num; i++) {  // 2, 3, 4, 5, 6, 7 ...........      // the purpose of this loop to check all the numbers from 2 to the value assigned to um

            int count = 0;       // putting the counter inside the outer loop will RESET it back to 0 on each iteration of the OUTER loop

            // i = 7                i = 8
             /*
                    7 % 2           8 % 2
                    7 % 3           8 % 3
                    7 % 4           8 % 4
                    7 % 5           8 % 5
                    7 % 6           8 % 6
                    7 % 7           8 % 7
                                    8 % 8
              */

            for (int j = 2; j <= i; j++) {           // INNER LOOP

                if (i % j == 0) {               // 7 % 2 == 0  --- >  false
                    count++;                    // 7 % 3              false
                }                               // 7 % 4              false
                                                // 7 % 5              false
            }                                   // 7 % 6              false
                                                // 7 % 7              true   ---- >  count = 1;

           if (count == 1) {
               System.out.println( i + " is prime number ");

           }       // This is where our INNER LOOP ends






//            if (i % 1 == 0 && i % i == 0) {   // 4 -- > 2        --- > not valid
//
//            }

            
        }      // This is where our OUTER LOOP ends

        System.out.println("-------------------------------");


        int num2  = 46;
        int count2 = 0;
        for (int j = 1; j <= num2; j++) {

            if (num2  % j  == 0) {
                count2++;
            }

        }


        if (count2 == 2) {
            System.out.println( num2 + " is prime number ");

        } else {
            System.out.println( num2 + " is  NOT prime number ");

        }




    }
}
