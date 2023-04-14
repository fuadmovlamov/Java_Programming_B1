package day08_scanner_logical_operators;

public class Speeding {

    /*
        Declare 3 variables:
            Current speed
            speed limit 65
            speeding

            print
            "Is this person speeding?" true or false


            Note: If the requirement is not clear. Ask the questions
            In this case what the 65 speed should be considered?
            As higher or lower than speed limit.

            -65 or lower not speeding
            -more than 65 is speeding

     */
    public static void main (String [] args) {

        int currentSpeed = 65;
        int speedLimit = 65;

        boolean isSpeeding = currentSpeed >= speedLimit;

        System.out.println("Is this person speeding? " + isSpeeding);


    }

}
