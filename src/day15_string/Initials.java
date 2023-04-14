package day15_string;

import java.util.Scanner;

/*
         Ask the user to enter their first name
         Ask the user to enter their last name
         Print the initials as uppercase letters

         james
         bond
         JB
      */
public class Initials {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String first = input.next();
        System.out.print("Enter last name: ");
        String last = input.next();

        //har firstChar = first.charAt(0);

        String initials = "" + first.charAt(0) + last.charAt(0);
        //String initials = ("" + first.charAt(0) + last.charAt(0)).toUpperCase();
        //initials = initials.toUpperCase();
        System.out.println("Your initial is: " + initials);
        System.out.println("Your initial is: " + initials.toUpperCase());







    }

}
