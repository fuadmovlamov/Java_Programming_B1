package day15_string;

/*
        //starts with
        Mr LastName     - Sir       - "Hello Sir
        Mister LastName - Sir       - "Hello Sir

        Ms LastName    - Ma'am     - "Hello Ma'am
        Dr LastName     - Doctor

        // ends with
        Jr              - Junior      - Nice to meet you Junior
        Sr              - Senior


 */


import java.util.Scanner;

public class Title {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name, with titles: ");

        String nameAndTitle = input.nextLine();  // MR LastName  --  Mr LastName  --  mr LastName

        //nameAndTitle = nameAndTitle.toLowerCase();  // We are trying to have one version for different version inputs.

        /*
           if (nameAndTitle.startsWith("mr") || nameAndTitle.startsWith("mister")) {
            System.out.println("Hello Sir");
        } else if (nameAndTitle.startsWith("ms") || nameAndTitle.startsWith("madam")) {
            System.out.println("Hello Ma'am");
        } else if (nameAndTitle.startsWith("dr") || nameAndTitle.startsWith("doctor")) {
            System.out.println("Hello Doctor");
        }
         */


        nameAndTitle = nameAndTitle.toLowerCase();



        if (nameAndTitle.startsWith("mr") || nameAndTitle.startsWith("mister")) {
            System.out.println("Hello Sir");
        } else if (nameAndTitle.startsWith("ms") || nameAndTitle.startsWith("madam")) {
            System.out.println("Hello Ma'am");
        } else if (nameAndTitle.startsWith("dr") || nameAndTitle.startsWith("doctor")) {
            System.out.println("Hello Doctor");
        }



        if (nameAndTitle.endsWith("jr")) {
            System.out.println("Hello Junior");
        } else if  (nameAndTitle.endsWith("sr")){
            System.out.println("Hello Senior");
        }




    }

}
