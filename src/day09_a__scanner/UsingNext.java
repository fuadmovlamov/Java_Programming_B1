package day09_a__scanner;

//import java.util.Scanner;

import java.util.*;


public class UsingNext {

    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Today is Saturday");
        System.out.print("What is todays class? ");   // Java
        String className = input.next();
        System.out.println();


        System.out.print("What month is it? ");  // February
        String month = input.next();
        System.out.println("I like " + month + " month");
        System.out.println();

        input.nextLine();   // to handle the issue when we press ENTER/RETURN
        System.out.print("Enter you full name: ");  //multiple words - has space in it
        String fullName = input.nextLine();
        System.out.println("Full name is: " + fullName);

        // In Scanner there is a method called .close(); -- IT is optional. YOU DO NOT HAVE TO USE IT
        input.close();



    }


}
