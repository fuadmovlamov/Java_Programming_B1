package day09_b__if_statements;

import java.util.Scanner;

public class SingleIfExample {

    public static void main(String[] args) {

        //if condition is true print out "Today is java day"


        if(true) {
            System.out.println("Today is java day");
        }
        //System.out.println("Today is java day");



        // max number of days in  Feb 28
        int maxNumberOfDays = 28;
        if (maxNumberOfDays == 28) {
            System.out.println("This month is February");
        }



        maxNumberOfDays = 30;
        if (maxNumberOfDays == 28) {
            System.out.println("This month is February");
        }
        System.out.println();


        int quizResult = 50;
        int passRate = 40;
        if (quizResult >= passRate) {
            System.out.println("Passed the exam.");
        }

        if (quizResult < passRate) {
            System.out.println("Failing the exam");
        }


        int year = 2021;


        // if year is equal or bigger than 2020 AND less than or equal to 2022 --- it is true
        boolean isCovidYears = year >= 2020 && year <= 2022;


        if(isCovidYears) {
            System.out.println("It was Covid a Covid year");
        }









    }


}
