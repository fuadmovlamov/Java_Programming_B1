package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
        all String types
        0 -> id
        1 -> first name
        2 -> last name
        3 -> batch number
     */
public class StudentInformation {
    public static void main(String[] args) {

        String [] student1 = {"B001", "Tom", "Jerry", "B#1"};
        System.out.println("This is the info for Student 1: " + Arrays.toString(student1));
        //System.out.println(student1);  // it is a hashcode -- location in memory

        System.out.println("-------------------------------");

        String [] student2 = new String[4];
        System.out.println("This is the info for Student 2: " + Arrays.toString(student2));
        student2[0] = "B002";
        student2[1] = "John";
        student2[2] = "Wick";
        student2[3] = "B#2";
        System.out.println("This is the info for Student 2: " + Arrays.toString(student2));

        System.out.println("-------------------------------");

        String [] student3 = new String[4];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ID:");
        student3[0] = input.next();

        System.out.print("Enter Name:");
        student3[1] = input.next();

        System.out.print("Enter Lastname:");
        student3[2] = input.next();

        System.out.print("Enter Batch No:");
        student3[3] = input.next();
        System.out.println("This is the info for Student 3: " + Arrays.toString(student3));

        System.out.println("-------------------------------");

        String [] questions = {"Enter ID:", "Enter Name:", " Enter Lastname:", "Enter Batch No:"};
        String [] student4 = new String[4];

        for (int i = 0; i < 4; i++) {        // for (int i = 0; i < questions.length; i++) {    --- >  you can do this as well.
            System.out.println(questions[i]);   // reading each element of the questions arrays
            student4[i] = input.next();       // assigning the Scanner input (users input) onto student4 array
        }
        System.out.println("This is the info for Student 4: " + Arrays.toString(student4));


    }
}

