package day12_switch_statements;

import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the wending machine");
        System.out.print("Please, select one of the followings: \n\tDrinks\n\tSnacks\n\tGum\n\nEnter:");

        String selection = input.next();

        String msg = "";

        switch (selection) {

            case "Drinks":
                System.out.print("\nYour chose drinks (click on 1, 2, 3): \n\t1) Water\n\t2) Soda\n\t3) Juice\n\nYour number");
                int drinkNUmber = input.nextInt();

                if (drinkNUmber == 1) {
                    msg = "You have selected water";
                } else  if (drinkNUmber == 2) {
                    msg = "You have selected soda";
                } else if (drinkNUmber == 3) {
                    msg = "You have selected juice";
                } else {
                    msg = "invalid input";
                }
                break;
            case "Snacks":
                System.out.print("\nYour chose snacks (click on 1, 2, 3): \n\t1) Candies\n\t2) Pringles\n\t3) Chips\n\nYour number");
                int snackNUmber = input.nextInt();

                if (snackNUmber == 1) {
                    msg = "You have selected Love";
                } else  if (snackNUmber == 2) {
                    msg = "You have selected Turbo";
                } else if (snackNUmber == 3) {
                    msg = "You have selected Dirol";
                } else {
                    msg = "invalid input";
                }
                break;
            case "Gum":
                System.out.print("\nYour chose gums (click on 1, 2, 3): \n\t1) Love\n\t2) Turbo\n\t3) Dirol\n\nYour number");
                int gumNUmber = input.nextInt();

                if (gumNUmber == 1) {
                    msg = "You have selected Love";
                } else  if (gumNUmber == 2) {
                    msg = "You have selected Turbo";
                } else if (gumNUmber == 3) {
                    msg = "You have selected Dirol";
                } else {
                    msg = "invalid input";
                }
                break;
            default:
                msg = "Not valid selection";

        }

        System.out.println(msg);


    }

}
