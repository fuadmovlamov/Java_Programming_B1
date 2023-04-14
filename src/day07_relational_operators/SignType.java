package day07_relational_operators;

public class SignType {

    /*
        Declare and assign a number

        I want to know the sing of the number
            if the number is positive
            if the number is negative
            if the number is 0


     */



    public static void main(String[] args) {


        int number = -1;

        number--; //


        boolean isPositive = number >= 0,
                isNegative = number <= 0,
                isZero = number == 0;


        System.out.println(number + " is bigger than zero: " + isPositive);
        System.out.println(number + " is less than zero: " + isNegative);
        System.out.println(number + " is equal to zero: " + isZero);



    }




}
