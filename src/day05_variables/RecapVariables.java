package day05_variables;

public class RecapVariables {

    public static void main(String[] args) {

        // Declare variables
        byte numberOfCoffeeCups;
        double totalPriceOfCoffee;
        int totalStudentInClass;

        // We can't print the variables because they do not have a value
//        System.out.println(numberOfCoffeeCups);
//        System.out.println(totalPriceOfCoffee);
//        System.out.println(totalStudentInClass);

        // Assign the values
        numberOfCoffeeCups = 2;
        totalPriceOfCoffee = 12.21;
        totalStudentInClass = 543;


        System.out.println(numberOfCoffeeCups);
        System.out.println(totalPriceOfCoffee);
        System.out.println(totalStudentInClass);


        // 2 * 543
        System.out.println(numberOfCoffeeCups + " * " +  totalStudentInClass);


        // Declare and assign
        double temperature = 20.6;
        int javaDays = 5;

        System.out.println();

        System.out.println("This is my temperature: " + temperature);

        //It is day 5 in java class
        System.out.println("It is day " + javaDays + " in java class");




    }


}
