package day11_if_statements;

/*
    declare a variable called speed and assign int value

    imagine we are in a neighbourhood (45) based on the speed limit print the related message

    above 90 (inclusive) -- > Your speed limit is requiring jail
    above 70 (inclusive) -- > Your speed limit requires DL suspension
    above 60 (inclusive) -- > Your speed limit requires court
    above 50 (inclusive) -- > Your speed limit requires a ticket
    between 35 and 50 (both inclusive)             -- > You speed limit is in the speed range
    below 35             -- >  Going to slow or you are parked
    else                 -- > not valid input.
 */


public class Drive {

    public static void main(String[] args) {

        int speed = -10;

            // 100 >= 90 -- > true
        if (speed >= 90) {
            System.out.println("Your speed limit is requiring jail");
        } else if (speed >= 70) {
            System.out.println("Your speed limit requires DL suspension");
        } else if (speed >= 60) {
            System.out.println("Your speed limit requires court");
        }else if (speed >= 50) {
            System.out.println("Your speed limit requires a ticket");
        }else if (speed >= 35 && speed <= 50) {
            System.out.println("You speed limit is in the speed range");
        }  else if ( speed >= 0 && speed < 35 ) {
            System.out.println("Going to slow or you are parked");
        } else {
            System.out.println("Not valid");
        }





    }



}
