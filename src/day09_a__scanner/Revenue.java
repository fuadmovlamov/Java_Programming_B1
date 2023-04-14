package day09_a__scanner;


import java.util.Scanner;

public class Revenue {


   /*

   Write a program that asks the user to "enter a price and quantity"


   and then calculate the revenue. revenue = price * quantity.

    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);  // java creates an object here

        double price;       // Java declares a price variable that has data type of double
        int quantity;       // Java declares a quantity variable that has data type of int

        System.out.println("Enter the price and quantity:");    //Java says print out whatever is in double quote
        price = input.nextDouble();                 // Java asks user to put input/info/value then assign that value to price variable
        quantity = input.nextInt();                 // Java asks user to put input/info/value then assign that value to quantity variable

        double revenue = price * quantity;


        System.out.println("Your revenue : " + revenue);



//        System.out.println();
//        System.out.println(price);
//        System.out.println(quantity);

//        System.out.println("Enter the price");
//        System.out.println("Enter the quantity:");








    }


}
