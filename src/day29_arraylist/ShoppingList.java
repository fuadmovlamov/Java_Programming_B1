package day29_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //This will be my shopping list to hold all the items.
        ArrayList <String> shoppingList = new ArrayList<>();
        String wantsContinue;
        int count = 0;
        /*
            Enter item
                apple
            Do you want to continue y/n?
            - yes / y
         */
        do {
            System.out.println("Enter the item: ");
            //String item = input.nextLine();
            shoppingList.add(input.nextLine());

            System.out.println("Do you want to continue y/n?");
            wantsContinue = input.nextLine();  // y or n
            //wantsContinue.equalsIgnoreCase("Y");

        } while (wantsContinue.equalsIgnoreCase("Y"));    //  while (input.nextLine().equalsIgnoreCase("Y"));


        System.out.println("Shopping List: " + shoppingList.size() + " items:");
        // looping through the list
        for ( String each : shoppingList) {
            System.out.println(++count + "\t" + each);
        }
        System.out.println("----------------------------------------");



        // How can I check if my list has water
        System.out.println("What item do you want to check if it is on the list?");
        String itemToCheck = input.nextLine();
        System.out.println(    shoppingList.contains(itemToCheck) ?  (itemToCheck + " is on the list") : (itemToCheck + " is not on the list")     );



        // Can you remove spefici item from the list?
        System.out.println("Do you wan to removed any items y/n?");
        if (input.nextLine().equalsIgnoreCase("y")) {
            System.out.println("What item or what number do you want to remove");
            String itemToRemove = input.nextLine(); // I am getting the input from user as a String even if it is a number

            // lets say user may give you either item name or the number of the item in the list --- >  "1" |  l;kweurjsd
            if (Character.isDigit(itemToRemove.charAt(0))){
                shoppingList.remove(Integer.parseInt(itemToRemove) -1 );
            } else {
                shoppingList.remove(itemToRemove);
            }


        }
        System.out.println("Final list: " + shoppingList);

    }

}
