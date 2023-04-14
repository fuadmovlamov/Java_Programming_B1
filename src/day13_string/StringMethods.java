package day13_string;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {

        String name = "James";  // --- > Q?

        //how to compare 2 strings exactly --- > we user .equals(); methods
        System.out.println(name.equals("James"));  // true
        System.out.println("cat".equals("dog"));  // false
        System.out.println(name.equals("james"));  // false


        // how to compare 2 strings ignoring case sensitiveness
        System.out.println(name.equalsIgnoreCase("JAMES"));  //



        String firstName = "James";  // --- > Q?
        String firstName2 = "James";  // --- > Q?
        String lastName = new String ("Bond");
        String lastName2 = new String ("Bond");

        new String ("NoReference");


        Scanner input = new Scanner (System.in);


        System.out.println(new String ("NoReference"));
        System.out.println("NoReference");

    }
}
