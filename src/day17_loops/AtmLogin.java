package day17_loops;

import java.util.Scanner;

public class AtmLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to ATM");
        int userInputPin;
        int validPin = 1788;
        int attemptCount = 1;

        /*
        ask user to "Enter a pin"

        after three invalid pin attempt, end the asking user

         */

        do {
            System.out.print("Enter a pin: ");
            userInputPin = input.nextInt();
            attemptCount++;
        } while (attemptCount <= 3 && validPin != userInputPin);



        if (validPin == userInputPin) {  // validPin.equals(userInputPin)
            System.out.println("You are logged in");
        } else {
            System.out.println("You are locked out. Please contact customer service");
        }








    }
}
