package day3_comments_escape_sequence;

public class TabAndNexLine {

    public static void main (String [] args){


        // This is without any tab
        System.out.println("This is not tabbed");


        // This is with one Tab
        System.out.println("\tThis is tabbed once");

        // This is with two tab
        System.out.println("\tThis is tabbed twice");

        // Here is it tabbed without escape sequence
        System.out.println("        This is tabbed without escape sequence.");


        // examples of new line
        System.out.println();
        System.out.println("1) Go to parking lot");
        System.out.println("2) Find the car");
        System.out.println("3) Start the car");



        System.out.println("\n1) Go to parking lot\n2) Find the car\n3) Start the car");


    }
}
